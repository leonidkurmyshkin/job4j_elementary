package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstdMax() {
        int result = MultiMax.max(15, 4, 8);
        assertThat(result, is(15));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(5, 5, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenAllTheSame() {
        int result = MultiMax.max(10, 10, 10);
        assertThat(result, is(10));
    }
}
