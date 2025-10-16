package com.lanam.arquiteturaSpring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ArquiteturaSpringApplication {

	public static void main(String[] args) {
        //SpringApplication.run(ArquiteturaSpringApplication.class, args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaSpringApplication.class);

        builder.bannerMode(Banner.Mode.OFF);
        builder.profiles("producao", "homologacao");

        builder.run(args);

        ConfigurableApplicationContext context = builder.context();
        ConfigurableEnvironment environment = context.getEnvironment();
        String applicationName = environment.getProperty("spring.application.name");
        System.out.println("Nome da aplicação: " + applicationName);

    }

}
