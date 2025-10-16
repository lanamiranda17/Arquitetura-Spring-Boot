package com.lanam.arquiteturaSpring.montadora.configuration;

import com.lanam.arquiteturaSpring.montadora.Motor;
import com.lanam.arquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration { //onde você ensina o Spring a fabricar os objetos “Montadora”, “Motor”, etc.

    @Bean (name = "motorAspirado") //; name opcional. O padrão é o nome do objeto
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);

        return motor;
    }

    @Bean
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("XPTO-0");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);

        return motor;
    }

    @Bean
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setCilindros(5);
        motor.setModelo("XPTO-0");
        motor.setLitragem(1.8);
        motor.setTipo(TipoMotor.TURBO);

        return motor;
    }
}
