package com.example.notetest;

import java.util.ArrayList;

public class Decks {
    private static final Decks Instance = new Decks();

    private ArrayList<Deck> decks;

    public static Decks getInstance() {
        return Instance;
    }

    public Decks() {
        decks = new ArrayList<Deck>();
    }

    public ArrayList<Deck> getDecks() {
        return decks;
    }
    public Deck getDecks(int i) {
        return decks.get(i);
    }
}
