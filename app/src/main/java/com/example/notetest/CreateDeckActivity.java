package com.example.notetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CreateDeckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_deck);
        getSupportActionBar().setTitle("Create Cards");
    }

}
