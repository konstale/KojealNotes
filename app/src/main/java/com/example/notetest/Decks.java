package com.example.notetest;

import java.util.ArrayList;

public class Decks {
    private static final Decks ourInstance = new Decks();

    private ArrayList<Deck> decks;

    public static Decks getInstance() {
        return ourInstance;
    }

    //public Decks() {
        //decks = new ArrayList<Deck>();
        //decks.add(new Decks());
        //decks.add (new Deck( "Months"));
        //decks.add (new Deck("Weekdays"));}

    public void addDeck(String deckName){
        Decks decks = new Decks();
        Deck deck = new Deck(deckName);
        ArrayList<Deck> receivedDecks = new ArrayList<Deck>();
        receivedDecks.add(deck);
        decks.setDeckList(receivedDecks);
    }

    private void setDeckList(ArrayList<Deck> receivedDecks) {
    }
    public void addDeck(String deckName){
      decks.add (new Deck (deckName));
    }


    public ArrayList<Deck> getDecks() {
        return decks;
    }
    public Deck getDecks(int i) {
        return decks.get(i);
    }
}
