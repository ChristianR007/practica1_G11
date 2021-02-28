package com.mycompany.general;

public class OperacionesBasicas {
    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    public int multiplicacion(int val1, int val2){
        return val1*val2;
    }
    
    public Double division(int val1, int val2) {
        if (val2 == 0) return null;
        return val1/val2;
    }
}