package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDay1() {
        String result = SwitchWeek.nameOfDay(1);
        assertThat(result, is("Понедельник"));
    }

    @Test
    public void nameOfDay2() {
        String result = SwitchWeek.nameOfDay(2);
        assertThat(result, is("Вторник"));
    }

    @Test
    public void nameOfDay3() {
        String result = SwitchWeek.nameOfDay(3);
        assertThat(result, is("Среда"));
    }

    @Test
    public void nameOfDay4() {
        String result = SwitchWeek.nameOfDay(4);
        assertThat(result, is("Четверг"));
    }

    @Test
    public void nameOfDay5() {
        String result = SwitchWeek.nameOfDay(5);
        assertThat(result, is("Пятница"));
    }

    @Test
    public void nameOfDay6() {
        String result = SwitchWeek.nameOfDay(6);
        assertThat(result, is("Суббота"));
    }

    @Test
    public void nameOfDay7() {
        String result = SwitchWeek.nameOfDay(7);
        assertThat(result, is("Воскресенье"));
    }

    @Test
    public void nameOfDayNone() {
        String result = SwitchWeek.nameOfDay(10);
        assertThat(result, is("Ошибка"));
    }
}