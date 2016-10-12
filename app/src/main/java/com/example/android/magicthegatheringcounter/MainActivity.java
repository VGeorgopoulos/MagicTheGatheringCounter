package com.example.android.magicthegatheringcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int FULL_HEALTH_POINTS = 20;
    public static final int DEFAULT_MANA_POINTS = 0;
    //Variables for HP and Mana of the players X & Y
    int healthPointsPlayerX = 20;
    int healthPointsPlayerY = 20;
    int manaPointsPlayerX = 0;
    int manaPointsPlayerY = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the current HP for Player X
     */
    public void displayHealthPointsForX(int hitPoints) {
        TextView currentHitPoints = (TextView) findViewById(R.id.currentXHP);
        currentHitPoints.setText(String.valueOf(hitPoints));
    }

    /**
     * Displays the current HP for Player Y
     */
    public void displayHealthPointsForY(int hitPoints) {
        TextView currentHitPoints = (TextView) findViewById(R.id.currentYHP);
        currentHitPoints.setText(String.valueOf(hitPoints));
    }

    /**
     * Displays the current Mana for Player X
     */
    public void displayManaPointsForX(int manaPoints) {
        TextView currentManaPoints = (TextView) findViewById(R.id.currentXMana);
        currentManaPoints.setText(String.valueOf(manaPoints));
    }

    /**
     * Displays the current Mana for Player X
     */
    public void displayManaPointsForY(int manaPoints) {
        TextView currentManaPoints = (TextView) findViewById(R.id.currentYMana);
        currentManaPoints.setText(String.valueOf(manaPoints));
    }

    /**
     * End match button onClick Event
     * Resets Mana and HP to Default values
     */
    public void endMatch(View view) {
        healthPointsPlayerX = 20;
        healthPointsPlayerY = 20;
        manaPointsPlayerX = 0;
        manaPointsPlayerY = 0;
        displayHealthPointsForX(FULL_HEALTH_POINTS);
        displayHealthPointsForY(FULL_HEALTH_POINTS);
        displayManaPointsForX(DEFAULT_MANA_POINTS);
        displayManaPointsForY(DEFAULT_MANA_POINTS);
    }

    /**
     * Plus HP Buttons for PlayerX
     */

    public void plusFiveX(View view) {
        healthPointsPlayerX += 5;
        displayHealthPointsForX(healthPointsPlayerX);
    }

    public void plusTwoX(View view) {
        healthPointsPlayerX += 2;
        displayHealthPointsForX(healthPointsPlayerX);
    }

    public void plusOneX(View view) {
        healthPointsPlayerX += 1;
        displayHealthPointsForX(healthPointsPlayerX);
    }

    /**
     * Minus HP Buttons for PlayerX
     */

    public void minusFiveX(View view) {
        healthPointsPlayerX -= 5;
        displayHealthPointsForX(healthPointsPlayerX);
    }

    public void minusTwoX(View view) {
        healthPointsPlayerX -= 2;
        displayHealthPointsForX(healthPointsPlayerX);
    }

    public void minusOneX(View view) {
        healthPointsPlayerX -= 1;
        displayHealthPointsForX(healthPointsPlayerX);
    }

    /**
     * Plus HP Buttons for PlayerY
     */

    public void plusFiveY(View view) {
        healthPointsPlayerY += 5;
        displayHealthPointsForY(healthPointsPlayerY);
    }

    public void plusTwoY(View view) {
        healthPointsPlayerY += 2;
        displayHealthPointsForY(healthPointsPlayerY);
    }

    public void plusOneY(View view) {
        healthPointsPlayerY += 1;
        displayHealthPointsForY(healthPointsPlayerY);
    }

    /**
     * Minus HP Buttons for PlayerY
     */

    public void minusFiveY(View view) {
        healthPointsPlayerY -= 5;
        displayHealthPointsForY(healthPointsPlayerY);
    }

    public void minusTwoY(View view) {
        healthPointsPlayerY -= 2;
        displayHealthPointsForY(healthPointsPlayerY);
    }

    public void minusOneY(View view) {
        healthPointsPlayerY -= 1;
        displayHealthPointsForY(healthPointsPlayerY);
    }


    /**
     * Mana Buttons For PlayerX
     * Also Mana can't go below Zero
     */
    public void plusManaX(View view) {
        manaPointsPlayerX += 1;
        displayManaPointsForX(manaPointsPlayerX);
    }

    public void minusManaX(View view) {
        if (manaPointsPlayerX > 0) {
            manaPointsPlayerX -= 1;
            displayManaPointsForX(manaPointsPlayerX);
        } else
            displayManaPointsForX(manaPointsPlayerX);
    }

    /**
     * Mana Buttons For PlayerY
     * Also Mana can't go below Zero
     */
    public void plusManaY(View view) {
        manaPointsPlayerY += 1;
        displayManaPointsForY(manaPointsPlayerY);
    }

    public void minusManaY(View view) {
        if (manaPointsPlayerY > 0) {
            manaPointsPlayerY -= 1;
            displayManaPointsForX(manaPointsPlayerY);
        } else
            displayManaPointsForX(manaPointsPlayerY);
    }

}
