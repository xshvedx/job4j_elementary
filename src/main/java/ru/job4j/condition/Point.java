package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(0, 0, 5, 5);
        System.out.println("result (0, 0) to (5, 5) " + result1);
        double result2 = Point.distance(4, 2, 0, 7);
        System.out.println("result (4, 2) to (0, 7) " + result2);
        double result3 = Point.distance(5, 6, 6, 5);
        System.out.println("result (5, 6) to (6, 5) " + result3);
    }
}


