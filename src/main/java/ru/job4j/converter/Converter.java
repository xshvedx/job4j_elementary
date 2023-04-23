package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 89;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 81;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("19.04.2024 - 140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 1.5730337f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 1.5730337 euro. Test result : " + passed);
        float dollar = Converter.rubleToDollar(200);
        System.out.println("19.04.2024 - 200 rubles are " + dollar + " dollar.");
        float inD = 200;
        float expectedD = 2.4691358f;
        float outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("200 rubles are 2.4691358 dollar. Test result : " + passed);
    }
    }
