package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        BigInteger expected = BigInteger.valueOf(120);
        int number = 5;
        BigInteger output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        BigInteger expected = BigInteger.valueOf(1);
        int number = 0;
        BigInteger output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void  whenCalculateFactorialForOneThenOne() {
        BigInteger expected = BigInteger.valueOf(1);
        int number = 1;
        BigInteger output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void  whenCalculateFactorialFor9ThenOne() {
        BigInteger expected = BigInteger.valueOf(362880);
        int number = 9;
        BigInteger output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void  whenCalculateFactorialFor15ThenOne() {
        BigInteger expected = BigInteger.valueOf(1307674368000L);
        int number = 15;
        BigInteger output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void  whenCalculateFactorialFor17ThenOne() {
        BigInteger expected = BigInteger.valueOf(355687428096000L);
        int number = 17;
        BigInteger output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void  whenCalculateFactorialFor23ThenOne() {
        BigInteger expected = new BigInteger("25852016738884976640000");
        int number = 23;
        BigInteger output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }
}