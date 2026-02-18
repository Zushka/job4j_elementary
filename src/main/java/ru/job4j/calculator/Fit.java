package ru.job4j.calculator;

public class Fit {

    public static double manWeigh(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeigh(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeigh(height);
        double woman = Fit.womanWeigh(height);
        System.out.println(man);
        System.out.println(woman);
    }
}
