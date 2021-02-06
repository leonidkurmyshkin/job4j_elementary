package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax15To12Then15() {
        assertThat(Max.max(15, 12), is(15));
    }

    @Test
    public void whenMax4To7To15Then15() {
        assertThat(Max.max(4, 7, 9), is(9));
    }

    @Test
    public void whenMax11To11To8To4Then11() {
        assertThat(Max.max(11, 11, 8, 4), is(11));
    }
}