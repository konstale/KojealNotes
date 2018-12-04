package com.example.notetest;

import java.util.ArrayList;

public class Decks {
    private static final Decks ourInstance = new Decks();

    private ArrayList<Deck> deckList;

    public static Decks getInstance() {
        return ourInstance;
    }

    public ArrayList<Deck> getDecks() {
        return deckList;
    }

    public void setDeckList(ArrayList<Deck> decks) {
        this.deckList = decks;
    }

    public Deck getDeck(int i) {
        return deckList.get(i);
    }
}
