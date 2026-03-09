package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    public void whenStart0Finish5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenStart0Finish100Then5050() {
        int start = 0;
        int finish = 100;
        int expected = 5050;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenStart1Finish1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenStart10Finish5Then0() {
        int start = 10;
        int finish = 5;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}