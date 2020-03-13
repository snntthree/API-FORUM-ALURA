package br.com.snntthree.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public String hellow(){
        return "<h1>API do Fórum da Alura<h1>";
    }
}
