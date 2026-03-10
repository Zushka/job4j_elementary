package ru.job4j.loop;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger calculate(int number) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}