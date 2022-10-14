package com.example.Calculator.model;

public class calcModel {
    private double firstNum;
    private double secondNum;
    private String operation;
    public String result;

    public double getFirstNum(){
        return this.firstNum;
    }
    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }
    public double getSecondNum() {
        return this.secondNum;
    }
    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }
    public void setArg2(double arg2) {
        this.secondNum = arg2;
    }
    public String getOperation() {
        return this.operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public String getResult() {
        return this.result;
    }
    public void setResult(String result) {
        this.result = result;
    }
}
