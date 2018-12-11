package com.example.notetest;

import android.widget.EditText;

import java.util.ArrayList;

/**
 * The array list where flashcard array is created and where all deck names are saved.
 */
public class Deck {

    private String name;
    private ArrayList<Flashcard> flashcards;
    private int i;

    public Deck(){
        this.name = name;
        this.flashcards = new ArrayList<Flashcard>();
        this.i = 0;
    }

    /**
     * Creates new Flashcard.
     * @param note
     */
    public void addFlashcard(String note){

        flashcards.add(new Flashcard(note));
    }

    /**
     * Sets Deck name.
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Calls Deck name.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String toString(){
        return this.name;
    }

    /**
     * Calls Flashcard notes from Flashcard.java
     * @return
     */
    public String getNotes(){
        return flashcards.get(0).getNote();

    }

    /**
     * To limit the program from going past entered notes.
     * @return
     */
    public String nextCard(){
        if (i<flashcards.size()-1){
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
