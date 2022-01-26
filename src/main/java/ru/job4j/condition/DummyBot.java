package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (question.equals("Привет, Бот")) {
            rsl = "Привет, Умник";
        } else if (question.equals("Пока")) {
            rsl = "До скорой встречи";
        }
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        DummyBot.answer("Привет, Бот");
        DummyBot.answer("Пока");
        DummyBot.answer("Шо ты");

    }
}
