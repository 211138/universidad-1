package com.example.universidad.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alumno")
public class AlumnoController {

    @GetMapping("consulta")
    public String cosulta(){
        return "consulta existosa";
    }

}
