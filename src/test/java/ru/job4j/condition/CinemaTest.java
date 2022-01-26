package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class CinemaTest {

    @Test
    public void if18ThenOK() {
        int age = 18;
        String expect = "It is not for your";
        String result = Cinema.ageChek(age);
        assertEquals(expect, result);

    }

    @Test
    public void if17ThenBan() {
        int age = 17;
        String expect = "It is not for your";
        String result = Cinema.ageChek(age);
        assertEquals(expect, result);
    }

    @Test
    public void if19ThenOK() {
        int age = 19;
        String expect = "Welcome to the cinema";
        String result = Cinema.ageChek(age);
        assertEquals(expect, result);
    }
}