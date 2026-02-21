package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    void when00to20then2() {
        int x1, y1, x2, y2;
        double expected = 2;
        x1 = 0; y1 = 0; x2 = 2; y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when55to55then0Dot0() {
        int x1, y1, x2, y2;
        double expected = 0;
        x1 = 5; y1 = 5; x2 = 5; y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus5Minus6toMinus23than9Dot48() {
        int x1, y1, x2, y2;
        double expected = 9.48;
        x1 = -5; y1 = -6; x2 = -2; y2 = 3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when2020to1010then14Dot14() {
        int x1, y1, x2, y2;
        double expected = 14.14;
        x1 = 20; y1 = 20; x2 = 10; y2 = 10;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}