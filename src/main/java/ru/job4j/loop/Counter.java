package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int a = start; a <= finish; a++) {
            sum = sum + a;
        }
        return sum;
    }

    public static int sum1(int start, int finish) {
        int sum1 = 0;
        for (int a = start; a <= finish; a++) {
            sum1 = sum1 - a;
        }
        return sum1;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum1(4, 10));
        System.out.println(sum1(3, 15));
        System.out.println(sum1(2, 13));
    }
}

