package com.example.notetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
Bundle extras = getIntent().getExtras();
int i = extras.getInt("EXTRA");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_deck);

            txt = (EditText) findViewById(R.id.changeText);
            saveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String getInput = txt.getText().toString();
                    Decks.getInstance().getDecks(i);



                }

            });

    }

}
