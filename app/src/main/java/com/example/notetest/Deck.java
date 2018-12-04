package com.example.notetest;

import java.util.ArrayList;

public class Deck {

    private String name;



    public Deck(String name){

        this.name = name;
    }

    public String getDeckName(){
        return name;

    }

    @Override
    public String toString(){
        return this.name;
    }

}
