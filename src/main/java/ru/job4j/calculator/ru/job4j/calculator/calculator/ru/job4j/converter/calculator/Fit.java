package ru.job4j.calculator.ru.job4j.calculator.calculator.ru.job4j.converter.calculator;

public class Fit {
    public static double manWeight(short heightMan) {
        double rsl = (190 - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short heightWoman) {
        double rsl = (167 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 167;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 167 is " + woman);
    }

}
