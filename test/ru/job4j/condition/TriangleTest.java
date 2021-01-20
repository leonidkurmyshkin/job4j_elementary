package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenAb2Ac2Bc2ExistTrue() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenAb2Ac4Bc2ExistFalse() {
        boolean result = Triangle.exist(2.0, 4.0, 2.0);
        assertThat(result, is(false));
    }
}