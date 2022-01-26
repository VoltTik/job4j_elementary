package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void ifMondayThen1() {
        String name = "Monday";
        int expected  = 1;
        int result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void ifMondayRusThen1() {
        String name = "Понедельник";
        int expected  = 1;
        int result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void ifNotExist0() {
        String name = "Salam";
        int expected  = -1;
        int result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }
}