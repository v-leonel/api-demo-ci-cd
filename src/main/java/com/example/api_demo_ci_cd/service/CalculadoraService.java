package com.example.api_demo_ci_cd.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CalculadoraService {
    public double divisao(double a, double b) {
        if (b == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
