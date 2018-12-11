package com.example.notetest;

import android.widget.EditText;

import java.util.ArrayList;

public class Deck {

    private String name;
    private ArrayList<Flashcard> flashcards;
    private int i;

    public Deck(){
        this.name = name;
        this.flashcards = new ArrayList<Flashcard>();
        this.i = 0;
    }
    public void addFlashcard(String note){
        flashcards.add(new Flashcard(note));
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

    public String getNotes(){
        return flashcards.get(0).getNote();

    }
    public String nextCard(){
        if (i<flashcards.size()){
            i++;
        }
        return flashcards.get(i).getNote();

    }
    public String lastCard(){
        if (i>0){
            i--;
        }
        return flashcards.get(i).getNote();
    }





}
