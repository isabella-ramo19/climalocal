package com.example.climalocal.controller;


import com.example.climalocal.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/api/health")

    public Object probarvista(){
        return new HealthResponse(true,"Hola, este es mi mensaje");

    }

}
