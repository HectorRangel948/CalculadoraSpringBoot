package com.calculadora.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    private double answer =0;
    public double calculate(double n1, double n2, @org.jetbrains.annotations.NotNull String operation){
        switch(operation){
            case "sumar":
                answer= n1+n2;
                break;

            case "restar":
                answer = n1-n2;
                break;
            case "dividir":
                if(n1==0 || n2==0){
                    throw new IllegalArgumentException("No se puede dividir entre cero");
                }
                else{
                    answer = n1/n2;
                }
                break;
            case "multiplicar":
                answer= n1*n2;
                break;

            default: throw new RuntimeException("Selecciona una opción valida");
        }
        return answer;
    }
}
