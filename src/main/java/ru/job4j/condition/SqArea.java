package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l =  h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double sqrt = SqArea.square(6, 2);
        System.out.println("Если p = 6, k = 2, то S = " + sqrt);
    }
}