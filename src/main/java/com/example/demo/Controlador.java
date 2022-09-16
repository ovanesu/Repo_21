
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    
    @GetMapping("/")
    public String mensaje(){
        System.out.println("mensaje de exito");
        return "Hola, esta es una prueba con Spring Boot en la nube";
    }
    
}
