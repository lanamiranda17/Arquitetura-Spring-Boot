package com.lanam.arquiteturaSpring.montadora.api;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD}) // Onde a annotation será usada: tipo, campo e método

@Bean
@Qualifier("motorTurbo")
public @interface Turbo {
}
