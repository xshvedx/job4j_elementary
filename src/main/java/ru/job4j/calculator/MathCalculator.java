package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subAndDivision(double first, double second) {
      return sub(first, second) + division(first, second);
    }

    public static double calculation(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + sub(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + calculation(10, 20));
    }
}
