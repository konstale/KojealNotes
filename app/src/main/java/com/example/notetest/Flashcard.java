package com.example.notetest;

/**
 * Handles the cards added to decks
 */
public class Flashcard{

    private String note;

    /**
     *
     * @param note
     */
    public Flashcard(String note){
        this.note = note;

    }

    /**
     * Calling the note from Flashcard.
     * @return
     */
    public String getNote(){
        return note;
    }




}
