package ru.job4j;

public class Homework {
    public static void rightNumChange(int number1, int number2) {
        System.out.println(number2 / 100 * 100 + number1 % 100);
        System.out.println(number1 / 100 * 100 + number2 % 100);
    }

    public static void main(String[] args) {
        rightNumChange(123, 456);
    }
}
