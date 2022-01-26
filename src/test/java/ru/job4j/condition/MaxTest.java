package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.maxOfTwo(first, second);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax10To5Then10() {
        int first = 10;
        int second = 5;
        int result = Max.maxOfTwo(first, second);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEquals() {
        int first = 5;
        int second = 5;
        int result = Max.maxOfTwo(first, second);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }
}