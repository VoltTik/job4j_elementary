package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        int forDay;
        for (int i = 0; i < 7; i++) {
            if (i >= 5) {
                forDay = hours[i] <= 8 ? hours[i] * 20 : 160 + (hours[i] - 8) * 30;
            } else {
                forDay = hours[i] <= 8 ? hours[i] * 10 : 80 + (hours[i] - 8) * 15;
            }
            sum += forDay;
        }
        return sum;
    }
}