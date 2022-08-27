package com.sthefany.projetoaula.domain;

import lombok.Data;

@Data
public class Greeting {
    private String saudacao;

    public Greeting (){
        this.saudacao = "Hello world!";
    }
}
