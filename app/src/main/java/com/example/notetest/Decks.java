package com.example.notetest;

import java.util.ArrayList;

public class Decks {
    private static final Decks ourInstance = new Decks();

    private ArrayList<Decks> decks;

    public static Decks getInstance() {
        return ourInstance;
    }

    public Decks() {
        decks = new ArrayList<Decks>();
        //decks.add(new Decks());
    }

    public ArrayList<Decks> getDecks() {
        return decks;
    }
    public Decks getDecks(int i) {
        return decks.get(i);
    }
}
