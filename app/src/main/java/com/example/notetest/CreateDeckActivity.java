package com.example.notetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CreateDeckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_deck);

        //changes title from "noteTest" to "Create Cards"
        getSupportActionBar().setTitle("Create Cards");

        Bundle b = getIntent().getExtras();
        int i = b.getInt("PLACEHOLDER",0);

        //(((TextView)findViewById(R.id.Name)).setText(Decks.getInstance().getDecks(i).getDeckName()));
        //(((TextView)findViewById(R.id.Type)).setText(Decks.getInstance().getDecks(i).getDeckType()));
    }

}
