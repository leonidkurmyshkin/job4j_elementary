package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialFor5Then120() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCalculateFactorialFor1Then1() {
        int rsl = Factorial.calc(1);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
}