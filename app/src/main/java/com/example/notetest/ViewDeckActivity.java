package com.example.notetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewDeckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_deck);

        //changes title from "noteTest" to "Kojeal Notes"
        getSupportActionBar().setTitle("Kojeal Notes");
    }
}
