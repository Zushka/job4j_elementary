package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.multiple(first, second);
    }

    public static double diverseAndDifference(double first, double second) {
        return MathFunction.diverse(first, second) + MathFunction.difference(first, second);
    }

    public static double multiplyAndDiverse(double first, double second) {
        return  MathFunction.multiple(first, second) + MathFunction.diverse(first, second)
            + MathFunction.sum(first, second) + MathFunction.difference(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + diverseAndDifference(10, 20));
        System.out.println("Результат расчёта равен: " + multiplyAndDiverse(10, 20));
    }
}
