package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Passage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage1);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ChallengeActivity.EXTRA_PASSAGE);
        TextView textView = findViewById(R.id.text_header_Passage1);
        textView.setText(message);
    }
}