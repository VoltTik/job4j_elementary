package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[1500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages: " + ages.length);
        System.out.println("Размер массива surnames: " + surnames.length);
        System.out.println("Размер массива prices: " + prices.length);
        String[] names = new String[4];
        names[0] = "Stephen";
        names[1] = "Ivan";
        names[2] = "Petr";
        names[3] = "Merelin";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
