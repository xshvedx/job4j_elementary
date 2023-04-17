package ru.job4j.condition;

public class StringRunner {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += " But I am a newbie. ";
        short year = 2022;
        byte first = 2;
        year += first;
        idea += year;
        System.out.println(idea);
    }
}
