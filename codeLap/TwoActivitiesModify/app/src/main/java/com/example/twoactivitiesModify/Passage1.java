package com.example.twoactivitiesModify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Passage1 extends AppCompatActivity {
    public static final String EXTRA_PASSAGE =
            "com.example.android.twoactivitiesModify.extra.PASSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage1);

    }

    public void launchItem1(View view) {
        Intent intent = new Intent(this, ChallengeActivity.class);
        String message = getString(R.string.item1);
        intent.putExtra(EXTRA_PASSAGE, message);
        startActivity(intent);
    }

    public void launchItem2(View view) {
        Intent intent = new Intent(this, ChallengeActivity.class);
        String message = getString(R.string.item2);
        intent.putExtra(EXTRA_PASSAGE, message);
        startActivity(intent);
    }

    public void launchItem3(View view) {
        Intent intent = new Intent(this, ChallengeActivity.class);
        String message = getString(R.string.item3);
        intent.putExtra(EXTRA_PASSAGE, message);
        startActivity(intent);
    }
}