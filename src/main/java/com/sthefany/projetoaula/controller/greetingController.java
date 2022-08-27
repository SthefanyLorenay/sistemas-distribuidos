package com.sthefany.projetoaula.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.sthefany.projetoaula.domain.Greeting;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {


    @GetMapping
    public ResponseEntity <String> digaola (){
        Greeting greeting = new Greeting();
        return greeting.getSaudacao();    }
    
}
