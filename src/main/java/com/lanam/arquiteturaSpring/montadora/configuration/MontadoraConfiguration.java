package com.lanam.arquiteturaSpring.montadora.configuration;

import com.lanam.arquiteturaSpring.montadora.Motor;
import com.lanam.arquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration { //onde você ensina o Spring a fabricar os objetos “Montadora”, “Motor”, etc.

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);

        return motor;
    }
}
