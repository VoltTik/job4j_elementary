package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class MortgageTest {
    @Test
    public void when1Year() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2Year() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when100Year() {
        int amount = 100;
        int salary = 1;
        double percent = 0;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when99Year() {
        int amount = 99;
        int salary = 1;
        double percent = 0;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 99;
        Assert.assertEquals(expected, result);
    }
}