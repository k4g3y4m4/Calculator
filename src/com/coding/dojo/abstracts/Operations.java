package com.coding.dojo.abstracts;

public abstract class Operations {
    private double firstNumber;
    private double secondNumber;
    private String operation;
    private double result;


    //getters and setters
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void makeOperation(){
        double result = 0;
        if(operation.equals("+")){
            result = firstNumber + secondNumber;
        }else if(operation.equals("-")){
            result = firstNumber - secondNumber;
        }else if(operation.equals("*")){
            result = firstNumber * secondNumber;
        }else if(operation.equals("/")){
            result = firstNumber / secondNumber;
        }
        setResult(result);
    }
    public void getResult() {
        System.out.println("Result: " + result);
    }

}
