package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (salary * year < amount * (1 + year  * percent / 100)) {
            year += 1;
        }
        return year;
    }
}
