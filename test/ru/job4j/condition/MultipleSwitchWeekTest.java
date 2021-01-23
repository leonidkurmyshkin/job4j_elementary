package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void monday1() {
        int result = MultipleSwitchWeek.numberOfDay("Monday");
        assertThat(result, is(1));
    }

    @Test
    public void monday2() {
        int result = MultipleSwitchWeek.numberOfDay("Понедельник");
        assertThat(result, is(1));
    }

    @Test
    public void tuesday1() {
        int result = MultipleSwitchWeek.numberOfDay("Tuesday");
        assertThat(result, is(2));
    }

    @Test
    public void tuesday2() {
        int result = MultipleSwitchWeek.numberOfDay("Вторник");
        assertThat(result, is(2));
    }

    @Test
    public void wednesday1() {
        int result = MultipleSwitchWeek.numberOfDay("Wednesday");
        assertThat(result, is(3));
    }

    @Test
    public void wednesday2() {
        int result = MultipleSwitchWeek.numberOfDay("Среда");
        assertThat(result, is(3));
    }

    @Test
    public void thursday1() {
        int result = MultipleSwitchWeek.numberOfDay("Thursday");
        assertThat(result, is(4));
    }

    @Test
    public void thursday2() {
        int result = MultipleSwitchWeek.numberOfDay("Thursday");
        assertThat(result, is(4));
    }

    @Test
    public void friday1() {
        int result = MultipleSwitchWeek.numberOfDay("Friday");
        assertThat(result, is(5));
    }

    @Test
    public void friday2() {
        int result = MultipleSwitchWeek.numberOfDay("Пятница");
        assertThat(result, is(5));
    }

    @Test
    public void saturday1() {
        int result = MultipleSwitchWeek.numberOfDay("Saturday");
        assertThat(result, is(6));
    }

    @Test
    public void saturday2() {
        int result = MultipleSwitchWeek.numberOfDay("Суббота");
        assertThat(result, is(6));
    }

    @Test
    public void sunday1() {
        int result = MultipleSwitchWeek.numberOfDay("Sunday");
        assertThat(result, is(7));
    }

    @Test
    public void sunday2() {
        int result = MultipleSwitchWeek.numberOfDay("Воскресенье");
        assertThat(result, is(7));
    }

    @Test
    public void unknown() {
        int result = MultipleSwitchWeek.numberOfDay("Неизвестный");
        assertThat(result, is(-1));
    }
}