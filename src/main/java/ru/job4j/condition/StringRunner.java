package ru.job4j.condition;

public class StringRunner {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " But I am a newbie. ";
        int year = 2022;
        byte first = 1;
        year += first;
        idea = idea + year;
        System.out.println(idea);
        year -= first;
        System.out.println("result = " + year);
        first = 2;
        year *= first;
        System.out.println("result = " + year);
        year = 4044;
        year /= first;
        System.out.println("result = " + year);
        first = 5;
        year %= first;
        System.out.println("result = " + year);
    }
}
