package com.example.notetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ViewDeckActivity extends AppCompatActivity {

    private int i;
private TextView ct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_deck);
        Bundle extras = getIntent().getExtras();
        i= extras.getInt("EXTRA");
        ct = findViewById(R.id.cardText);
        ct.setText(Decks.getInstance().getDecks(i).getNotes());


    }

    /**
     * Calls next note within Deck.
     * @param view
     */
    public void onRightButtonClick(View view){
        ct.setText(Decks.getInstance().getDecks(i).nextCard());

    }

    /**
     *  Calls previous note within Deck.
     * @param view
     */
    public void onLeftButtonClick(View view){
        ct.setText(Decks.getInstance().getDecks(i).lastCard());

    }

}
