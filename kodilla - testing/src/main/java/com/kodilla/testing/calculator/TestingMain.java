package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(180, 20);
        int subResult = calc.sub(200, 100);
        if (addResult == 200 && subResult == 100) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!!!");
        }
    }
}

