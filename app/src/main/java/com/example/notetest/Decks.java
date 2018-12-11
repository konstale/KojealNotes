package com.example.notetest;

import java.util.ArrayList;

/**
 * Handles the decks array list
 */
public class Decks {

    private static final Decks ourInstance = new Decks();

    private ArrayList<Deck> decks;

    public static Decks getInstance() {
        /**
         * Defines the instance in Decks
         */
        return ourInstance;
    }

    public Decks() {
        /**
         * makes new array list for decks into deck
         */
        decks = new ArrayList<Deck>();
        }


    public void addDeck(Deck d){
        /**
         * allows the deck to be added to list view when text is entered in create activity
         */
      this.decks.add(d);    }


    public ArrayList<Deck> getDecks() {
        /**
         * shows list of added decks in list view
         */
        return decks;
    }
    public Deck getDecks(int i) {
        /**
         * takes deck from getDecks and returns it to decks in deckView
         */
        return decks.get(i);
    }
}
