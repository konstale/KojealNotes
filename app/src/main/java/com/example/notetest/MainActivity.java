package com.example.notetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "DBG";
    public static final String PLACEHOLDER = "com.example.notetest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ListView lv = findViewById(R.id.deckView);

        lv.setAdapter(new ArrayAdapter<Deck>(this, android.R.layout.simple_list_item_1, Decks.getInstance().getDecks()));

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
    //makes the plus button open create deck activity
    public void addClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        builder.setTitle("Create Deck Name");
        final View setView = view.inflate(this, R.layout.popup, null);
        builder.setView(setView);
        builder.show();

    }
    //clicking save on dialog brings it to CreateDeckActivity
    public void onSave(View view){
        Intent createActivity = new Intent(MainActivity.this, CreateDeckActivity.class);
        startActivity(createActivity);
    }
    //clicking cancel on dialog brings it back to MainActivity
    public void onCancel(View view) {
        Intent MainActivity = new Intent(MainActivity.this, MainActivity.class);
        startActivity(MainActivity);

    }

}
