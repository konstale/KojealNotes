package com.example.notetest;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "DBG";
    public static final String PLACEHOLDER = "com.example.notetest";
    Deck newDeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //puts decks in a list view
        ListView lv = findViewById(R.id.deckView);

        lv.setAdapter(new ArrayAdapter<Deck>(this, android.R.layout.simple_list_item_1, Decks.getInstance().getDecks()));

        newDeck = new Deck();








        //makes long click on a deck name open create deck activity
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        Log.d(TAG, "onItemClick(" + i + ")");
        Intent nextActivity = new Intent(MainActivity.this, CreateDeckActivity.class);
        nextActivity.putExtra("EXTRA", i);
        startActivity(nextActivity);
        return true;}
    });








        //makes short click to open view deck activity
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(MainActivity.this, ViewDeckActivity.class);
                nextActivity.putExtra("EXTRA", i);
                startActivity(nextActivity);

            }
        });



    }
    //makes the plus button open create deck name
    public void addClick(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        builder.setTitle("Create Deck Name");
        final View setView = view.inflate(this, R.layout.popup, null);
        final EditText input = (EditText) setView.findViewById(R.id.Enter);
        builder.setView(setView);


        //makes save button to add enter message to list.
        builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Decks.getInstance().addDeck(newDeck);
                newDeck.setName(input.getText().toString());
                            }
        });
        //makes cancel button cancel the message and returns to list.
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                            }
        });
        builder.show();
        }

}
