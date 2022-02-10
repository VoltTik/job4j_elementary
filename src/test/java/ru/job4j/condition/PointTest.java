package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenQuarter1ToQuarter3() {
        Point a = new Point(3, 4);
        Point b = new Point(-3, -4);
        double expected = 10;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenQuarter2ToQuarter4() {
        Point a = new Point(-2, 2);
        Point b = new Point(2, -2);
        double out = a.distance(b);
        double expected = 5.66;
        Assert.assertEquals(expected, out, 0.01);
    }
}