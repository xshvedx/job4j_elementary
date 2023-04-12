package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double area(double a, double b, double c, double p) {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double p = TrgArea.area(2, 2, 2);
        System.out.println("area p = " + p);
        double s = TrgArea.area(2, 2, 2, 3);
        System.out.println("area s = " + s);
    }
    }
