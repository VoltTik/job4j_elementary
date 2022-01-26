package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Triangle;

public class TriangleTest {

    @Test
    public void ifExist() {
        double ab = 10;
        double ac = 10;
        double bc = 10;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void ifNotExist() {
        double ab = 5;
        double ac = 10;
        double bc = 21;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}