package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class RectangleAreaTest {

    @Test
    void whenP6K2then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP2K6then0Dot12() {
        double p = 2;
        double k = 6;
        double expected = 0.12;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K5then3Dot47() {
        double p = 10;
        double k = 5;
        double expected = 3.47;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}