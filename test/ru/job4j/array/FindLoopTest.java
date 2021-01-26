package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayDoesNotHave7() {
        int[] input = {5, 4, 3, 2};
        int result = FindLoop.indexOf(input, 7);
        assertThat(result, is(-1));
    }

    @Test
    public void whenArrayHas7Then4() {
        int[] input = {5, 4, 3, 2, 7, 8};
        int result = FindLoop.indexOf(input, 7);
        assertThat(result, is(4));
    }

    @Test
    public void whenFind10() {
        int[] input = new int[] {5, 2, 10, 2, 4, 7};
        int value = 4;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind() {
        int[] input = new int[] {5, 2, 10, 2, 4, 7};
        int value = 8;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}