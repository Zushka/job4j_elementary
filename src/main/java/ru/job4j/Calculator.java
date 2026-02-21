package ru.job4j;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);

    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
        plus(5, 5);
        minus(22, 10);
        minus(444, 80);
    }
}
