package com.lanam.arquiteturaSpring.montadora.api;

import com.lanam.arquiteturaSpring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired                                            //pegue uma instancia de motor do container para usar aqui
                                                            // QUALIFIER: Necessario toda vez que tiver mais de um bean do mesmo tipo
    @Aspirado                                               // Annotation criada para substituir o qualifier
    private Motor motor;                                  // INJEÇÃO DE DEPENDENCIA


    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}

