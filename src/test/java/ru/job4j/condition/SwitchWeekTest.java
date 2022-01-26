package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void isOneThenMonday() {
        int day = 1;
        String expected = "Понедельник";
        String result  = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isSevenThenSunday() {
        int day = 7;
        String expected = "Воскресенье";
        String result  = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isNineThenError() {
        int day = 9;
        String expected = "Ошибка";
        String result  = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, result);
    }
}