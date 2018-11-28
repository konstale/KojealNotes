package com.example.notetest;

public class Flashcard{

    private String textOne;
    private String textTwo;

    public Flashcard(String textOne, String textTwo){
        this.textOne = textOne;
        this.textTwo = textTwo;
    }

    public String getTextOne(){
        return textOne;
    }

    public String getTextTwo(){
        return textTwo;
    }



}
