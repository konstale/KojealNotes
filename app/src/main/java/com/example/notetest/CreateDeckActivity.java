package com.example.notetest;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateDeckActivity extends AppCompatActivity {

    Button saveButton;
    EditText txt;
    ListView show;

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_deck);
        Bundle extras = getIntent().getExtras();
        i= extras.getInt("EXTRA");

            txt = (EditText) findViewById(R.id.changeText);
            //saveButton.setOnClickListener(new View.OnClickListener() {
            //    @Override
            //    public void onClick(View v) {
            //        String getInput = txt.getText().toString();
            //        Decks.getInstance().getDecks(i).addFlashcard(getInput);
            //        Log.d("dbg" ,Decks.getInstance().getDecks(i).getNotes());



            //    }

            //});

    }

    public void onSaveButtonClick(View view){
        String getInput = txt.getText().toString();
        Decks.getInstance().getDecks(i).addFlashcard(getInput);
        Log.d("dbg" ,Decks.getInstance().getDecks(i).getNotes());

    }

}
