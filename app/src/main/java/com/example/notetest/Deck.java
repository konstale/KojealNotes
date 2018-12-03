package com.example.notetest;

import java.util.ArrayList;

public class Deck {

    private String name;
    private String type;


    public Deck(String name, String type){

        this.name = name;
        this.type = type;
    }

    public getDeckName(){
        return name;

    }

    public getDeckType(){
        return type;
    }

}
