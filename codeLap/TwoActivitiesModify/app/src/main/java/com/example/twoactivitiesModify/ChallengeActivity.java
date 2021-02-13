package com.example.twoactivitiesModify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChallengeActivity extends AppCompatActivity {
    public static final String EXTRA_PASSAGE =
            "com.example.android.twoactivitiesModify.extra.PASSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);
    }

    public void launchPassage1(View view) {
        String message = "You are reading Passage No.1";
        Intent intent = new Intent(this, Passage1.class);
        intent.putExtra(EXTRA_PASSAGE, message);
        startActivity(intent);
    }

    public void launchPassage2(View view) {
        String message = "You are reading Passage No.2";
        Intent intent = new Intent(this, Passage2.class);
        intent.putExtra(EXTRA_PASSAGE, message);
        startActivity(intent);
    }

    public void launchPassage3(View view) {
        String message = "You are reading Passage No.3";
        Intent intent = new Intent(this, Passage3.class);
        intent.putExtra(EXTRA_PASSAGE, message);
        startActivity(intent);
    }


}