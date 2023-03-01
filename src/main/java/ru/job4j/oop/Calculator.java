package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        int rsl = sum(10);
        System.out.println(rsl);
        rsl = minus(10);
        System.out.println(rsl);
        Calculator calculator = new Calculator();
        rsl = calculator.divide(10);
        System.out.println(rsl);
        rsl = calculator.multiply(10);
        System.out.println(rsl);
        rsl = calculator.sumAllOperation(10);
        System.out.println(rsl);
    }
}
