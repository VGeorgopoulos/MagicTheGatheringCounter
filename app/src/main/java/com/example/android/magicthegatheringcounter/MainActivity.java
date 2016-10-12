package com.example.android.magicthegatheringcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Variables for HP and Mana of the players X & Y
    int playerXhp = 20;
    int playerYhp = 20;
    int playerXmana = 0;
    int playerYmana = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the current HP for Player X
     */
    public void displayXhp(int hp) {
        TextView currentHP = (TextView) findViewById(R.id.currentXHP);
        currentHP.setText(String.valueOf(hp));
    }

    /**
     * Displays the current HP for Player Y
     */
    public void displayYhp(int hp) {
        TextView currentHP = (TextView) findViewById(R.id.currentYHP);
        currentHP.setText(String.valueOf(hp));
    }

    /**
     * Displays the current Mana for Player X
     */
    public void displayManaX(int mana) {
        TextView currentMana = (TextView) findViewById(R.id.currentXMana);
        currentMana.setText(String.valueOf(mana));
    }

    /**
     * Displays the current Mana for Player X
     */
    public void displayManaY(int mana) {
        TextView currentMana = (TextView) findViewById(R.id.currentYMana);
        currentMana.setText(String.valueOf(mana));
    }

    /**
     * End match button onClick Event
     * Resets Mana and HP to Default values
     */
    public void endMatch(View view) {
        playerXhp = 20;
        playerYhp = 20;
        playerXmana = 0;
        playerYmana = 0;
        displayXhp(20);
        displayYhp(20);
        displayManaX(0);
        displayManaY(0);
    }

    /**
     * Plus HP Buttons for PlayerX
     */

    public void plusFiveX(View view) {
        playerXhp += 5;
        displayXhp(playerXhp);
    }

    public void plusTwoX(View view) {
        playerXhp += 2;
        displayXhp(playerXhp);
    }

    public void plusOneX(View view) {
        playerXhp += 1;
        displayXhp(playerXhp);
    }

    /**
     * Minus HP Buttons for PlayerX
     */

    public void minusFiveX(View view) {
        playerXhp -= 5;
        displayXhp(playerXhp);
    }

    public void minusTwoX(View view) {
        playerXhp -= 2;
        displayXhp(playerXhp);
    }

    public void minusOneX(View view) {
        playerXhp -= 1;
        displayXhp(playerXhp);
    }

    /**
     * Plus HP Buttons for PlayerY
     */

    public void plusFiveY(View view) {
        playerYhp += 5;
        displayYhp(playerYhp);
    }

    public void plusTwoY(View view) {
        playerYhp += 2;
        displayYhp(playerYhp);
    }

    public void plusOneY(View view) {
        playerYhp += 1;
        displayYhp(playerYhp);
    }

    /**
     * Minus HP Buttons for PlayerY
     */

    public void minusFiveY(View view) {
        playerYhp -= 5;
        displayYhp(playerYhp);
    }

    public void minusTwoY(View view) {
        playerYhp -= 2;
        displayYhp(playerYhp);
    }

    public void minusOneY(View view) {
        playerYhp -= 1;
        displayYhp(playerYhp);
    }


    /**
     * Mana Buttons For PlayerX
     * Also Mana can't go below Zero
     */
    public void plusManaX(View view) {
        playerXmana += 1;
        displayManaX(playerXmana);
    }

    public void minusManaX(View view) {
        if (playerXmana > 0) {
            playerXmana -= 1;
            displayManaX(playerXmana);
        } else
            displayManaX(playerXmana);
    }

    /**
     * Mana Buttons For PlayerY
     * Also Mana can't go below Zero
     */
    public void plusManaY(View view) {
        playerYmana += 1;
        displayManaY(playerYmana);
    }

    public void minusManaY(View view) {
        if (playerYmana > 0) {
            playerYmana -= 1;
            displayManaX(playerYmana);
        } else
            displayManaX(playerYmana);
    }

}
