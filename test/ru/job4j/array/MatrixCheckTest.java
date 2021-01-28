package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal1() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontal2() {
        char[][] input = {
                {' ', ' ', ' '},
                {'1', '2', '3'},
                {'X', 'X', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 2);
        assertThat(result, is(false));
    }
}