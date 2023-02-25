package pro.sky.calculator;

import pro.sky.calculator.exception.DevideByZero;

public class CalculatorServices {
    public String calcPlus (Integer a, Integer b) {
        int d = a + b;
            return a + " + " + b + " = " + d;
         }

    public String calcMinus (Integer a, Integer b) {
        int d = a - b;
        return a + " - " + b + " = " + d;
         }

    public String calcMultiply (Integer a, Integer b) {
        int d = a * b;
        return a + " * " + b + " = " + d;
        }

    public String calcDevide (Integer a, Integer b) {
       if (b.equals(0)) {
           throw new DevideByZero();
       }
       else {
            int d = a / b;
            return a + " / " + b + " = " + d;}
        }
    }