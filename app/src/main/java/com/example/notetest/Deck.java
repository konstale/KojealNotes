package com.example.notetest;

import android.widget.EditText;

import java.util.ArrayList;

public class Deck {

    private String name;
    private ArrayList<Flashcard> flashcards;

    public Deck(){
        this.name = name;
        this.flashcards = new ArrayList<Flashcard>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name;
    }





}
