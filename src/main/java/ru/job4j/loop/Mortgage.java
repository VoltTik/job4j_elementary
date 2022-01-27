package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, int salary, double percent) {
        int year = 0;
        int earnedSum = 0;
        double sumToPay = amount;
        while (earnedSum < sumToPay) {
            year += 1;
            earnedSum += salary;
            sumToPay += amount * percent / 100;

        }
        return year;
    }
}
