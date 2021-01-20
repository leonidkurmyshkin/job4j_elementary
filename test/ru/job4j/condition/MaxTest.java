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
    public void whenMax4To7Then7() {
        assertThat(Max.max(4, 7), is(7));
    }

    @Test
    public void whenMax11To11Then11() {
        assertThat(Max.max(11, 11), is(11));
    }
}