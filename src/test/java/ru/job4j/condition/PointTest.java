package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distansce(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenQuarter1ToQuarter3() {
        int x1 = 3;
        int y1 = 4;
        int x2 = -3;
        int y2 = -4;
        double expected = 10;
        double out = Point.distansce(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenQuarter2ToQuarter4() {
        int x1 = -2;
        int y1 = 2;
        int x2 = 2;
        int y2 = -2;
        double expected = 5.66;
        double out = Point.distansce(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}