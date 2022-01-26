package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return  value / 70;
    }

    public static float rubleToDollar(float value) {
        return  value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(inEuro);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 Euro. Test result :" + passed1);
        float inDollar = 120;
        float expected2 = 2;
        float out2 = Converter.rubleToDollar(inDollar);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2 Dollar. Test result :" + passed2);

    }
}
