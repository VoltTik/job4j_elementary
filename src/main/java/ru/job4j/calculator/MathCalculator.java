package ru.job4j.calculator;

import  static main.java.ru.job4j.math.MathFunction.*;

public class MathCalculator {
    /**Сумма орпераций сложения и умножения
     */
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    /**Сумма орпераций вычитания и деления
     */
    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    /**Сумма всех операций
     */
    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + subtraction(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма орпераций сложения и умножения равена: " + sumAndMultiply(10, 20));
        System.out.println("Сумма орпераций вычитания и деления равена: " + subtractionAndDivision(10, 20));
        System.out.println("Сумма всех операций равена: " + sumAll(10, 20));
    }
}