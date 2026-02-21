package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input;
        double expected, output;
        input = 180;
        expected = 92;
        output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input;
        double expected, output;
        input = 170;
        expected = 69;
        output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}