package com.example.notetest;

import java.util.ArrayList;

public class Decks {
    private static final Decks ourInstance = new Decks();

    private ArrayList<Deck> decks;

    public static Decks getInstance() {
        return ourInstance;
    }

    public Decks() {
        decks = new ArrayList<Deck>();
        decks.add(new Deck());
    }

    public ArrayList<Deck> getDecks() {
        return decks;
    }
    public Deck getDecks(int i) {
        return decks.get(i);
    }
}
