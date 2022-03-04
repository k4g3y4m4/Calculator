package com.coding.dojo;
import com.coding.dojo.abstracts.Operations;

public class Calculator extends Operations {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setFirstNumber(10.5);
        calculator.setOperation("+");
        calculator.setSecondNumber(5.5);
        calculator.makeOperation();
        calculator.getResult();
    }
}
