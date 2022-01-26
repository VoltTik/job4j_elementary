package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот";
        String out = DummyBot.answer(in);
        String expected = "Привет, Умник";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока";
        String out = DummyBot.answer(in);
        String expected = "До скорой встречи";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Салам/2";
        String out = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, out);
    }
}