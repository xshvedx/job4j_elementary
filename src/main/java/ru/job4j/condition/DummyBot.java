package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "I don't know. Please, ask another question.";

        if ("Hi, Bot.".equals(question)) {
            rsl = "Hi, SmartAss.";

        } else if ("See you later.".equals(question)) {
            rsl = "Bye.";

        } else if ("Can you add two plus two?".equals(question)) {
            rsl = "I don't know. Please, ask another question.";

        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("See you later.");
        System.out.println(rsl);
        rsl = DummyBot.answer("I don't know. Please, ask another question.");
        System.out.println(rsl);
    }
}
