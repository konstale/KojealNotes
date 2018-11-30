package com.example.notetest;

public class Decks {
    private static final Decks ourInstance = new Decks();

    public static Decks getInstance() {
        return ourInstance;
    }

    private Decks() {
    }
}
