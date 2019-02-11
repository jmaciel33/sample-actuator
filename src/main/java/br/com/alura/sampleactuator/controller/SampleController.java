package br.com.alura.sampleactuator.controller;

import br.com.alura.sampleactuator.domain.Aula;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SampleController {

    @GetMapping(value="/aulaDeHoje")
    public Aula getAulaDeHoje(){
     return new Aula("Olá, vamos testar o actuator?", new Date());
    }

}
