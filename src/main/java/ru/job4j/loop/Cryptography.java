package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder encrypted = new StringBuilder(s);
        if (encrypted.length() == 0) {
            return "empty";
        } else if (encrypted.length() > 4) {
            for (int index = 0; index < encrypted.length() - 4; index++) {
                encrypted.setCharAt(index, '#');
            }
        }
        s = encrypted.toString();
        System.out.println(s);
        return s;
    }
}