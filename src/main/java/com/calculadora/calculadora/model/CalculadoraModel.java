package com.calculadora.calculadora.model;

public class CalculadoraModel {
    private double n1;
    private double n2;
    private String operation;

    //Constructor
    public CalculadoraModel(){};

    public CalculadoraModel(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    //Getters and Setters

    public double getN1(){
        return this.n1;
    }

    public void setN1(double n1){
        this.n1 = n1;
    }

    public double getN2(){
        return this.n2;
    }

    public void setN2(double n2){
        this.n2 = n2;
    }

    public String getOperation(){
        return this.operation;
    }

    public void setOperation(String operation){
        this.operation=operation;
    }

}
