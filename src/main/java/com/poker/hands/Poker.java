package com.poker.hands;

public class Poker {
    private String name;
    private String[] cards;

    public Poker(String name, String input) {
        this.name = name;
        this.cards = input.split(" ");
    }

    public String battle(Poker play) {
        return null;
    }
}
