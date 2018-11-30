package com.example.notetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

        lv.setAdapter(new ArrayAdapter<Decks>(
                this,
                android.R.layout.simple_list_item_1,
                Decks.getInstance().getDecks())
        );

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(MainActivity.this, CreateDeckActivity.class);
                nextActivity.putExtra("EXTRA", i);
                startActivity(nextActivity);

            }
        });
    }



}
