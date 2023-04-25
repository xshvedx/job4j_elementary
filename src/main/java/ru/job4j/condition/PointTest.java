package ru.job4j.condition;

public class PointTest {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = -1;
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(3, 0, 5, 5);
        double result2 = Point.distance(4, 2, 0, 7);
        double result3 = Point.distance(2, 6, 0, 6);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (3, 0) to (5, 5) " + result1);
        System.out.println("result (4, 2) to (0, 7) " + result2);
        System.out.println("result (2, 6) to (0, 6) " + result3);
    }
        }
