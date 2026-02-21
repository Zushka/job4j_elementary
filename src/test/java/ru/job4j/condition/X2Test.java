package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int a, b, c, x, expected, result;
        a = 10; b = 0; c = 0; x = 2; expected = 40;
        result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X1Then3() {
        int a, b, c, x, expected, result;
        a = 1; b = 1; c = 1; x = 1; expected = 3;
        result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA0B1C1X1Then2() {
        int a, b, c, x, expected, result;
        a = 0; b = 1; c = 1; x = 1; expected = 2;
        result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C0X1Then2() {
        int a, b, c, x, expected, result;
        a = 1; b = 1; c = 0; x = 1; expected = 2;
        result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X0Then1() {
        int a, b, c, x, expected, result;
        a = 1; b = 1; c = 1; x = 0; expected = 1;
        result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }
}