package com.example.notetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CreateDeckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_deck);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_CREATE);

        //changes title from "noteTest" to "Create Cards"
        //getSupportActionBar().setTitle("Create Cards");
    }

}
