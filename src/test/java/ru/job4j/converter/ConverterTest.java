package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class ConverterTest {

    @Test
    void  whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float value = 0.0001f;
        float output = Converter.rubleToEuro(input);
        assertThat(output).isEqualTo(expected, withPrecision(value));
        System.out.println(output + " " + expected);
    }

    @Test
    void whenConvert120RblThen2Dollar() {
        float input = 120;
        float expected = 2;
        float value = 0.0001f;
        float output = Converter.rubleToDollar(input);
        assertThat(output).isEqualTo(expected, withPrecision(value));
        System.out.println(output + " " + expected);

    }

    @Test
    void whenConvert180RblThen3Dollar() {
        float input = 180;
        float expected = 3;
        float value = 0.0001f;
        float output = Converter.rubleToDollar(input);
        assertThat(output).isEqualTo(expected, withPrecision(value));
        System.out.println(output + " " + expected);
    }
}