package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return x / y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation() {
        return sum(10) + minus(1) + divide(1) + multiply(5);
    }

    public static void main(String[] args) {
        int rsl = sum(10);
        System.out.println(rsl);
        rsl = minus(1);
        System.out.println(rsl);
        Calculator calculator = new Calculator();
        rsl = calculator.divide(1);
        System.out.println(rsl);
        Calculator calculator1 = new Calculator();
        rsl = calculator1.multiply(5);
        System.out.println(rsl);
        Calculator calculator2 = new Calculator();
        rsl = calculator2.sumAllOperation();
        System.out.println(rsl);
    }
}
