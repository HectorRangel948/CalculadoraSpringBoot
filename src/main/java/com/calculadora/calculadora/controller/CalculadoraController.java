package com.calculadora.calculadora.controller;

import com.calculadora.calculadora.model.CalculadoraModel;
import com.calculadora.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/calculator")
public class CalculadoraController {
    @Autowired
    private CalculadoraService calculadoraService;

    @PostMapping("calculate")
    public ResponseEntity<Double> calculate(@RequestBody CalculadoraModel request){
        double result = calculadoraService.calculate(request.getN1(), request.getN2(), request.getOperation());
        return ResponseEntity.ok(result);
    }

}
