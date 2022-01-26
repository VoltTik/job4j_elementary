package ru.job4j.condition;

public class Cinema {

    public static String ageChek(int age) {
        String solution;
        if (age > 18) {
            solution =  "Welcome to the cinema";
        } else {
            solution =  "It is not for your";
        }
        System.out.println(solution);
        return solution;
    }

    public static void main(String[] args) {
        ageChek(18);
        ageChek(20);
        ageChek(15);
    }
}
