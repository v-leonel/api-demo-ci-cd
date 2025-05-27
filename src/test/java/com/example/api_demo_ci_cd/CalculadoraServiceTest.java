package com.example.api_demo_ci_cd;

import com.example.api_demo_ci_cd.service.CalculadoraService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraServiceTest {

    @Test
    @DisplayName("Quando acionado com 10 e 2, deve retornar 5")
    public void testDividir(){
        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 2;
        double esperado = 5;

        double resultado = calculadoraService.divisao(a, b);

        assertEquals(esperado, resultado);
    }
}
