package com.example.twoactivitiesModify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ChallengeActivity extends AppCompatActivity {
    private TextView mReplyHeadTextView;
    private TextView mReplyTextView;
    private EditText mLocationEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);

        mReplyHeadTextView = findViewById(R.id.chall_header);
        mReplyTextView = findViewById(R.id.list1);
        mLocationEditText = findViewById(R.id.location_edittext);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Passage1.EXTRA_PASSAGE);
        TextView textView = findViewById(R.id.list1);
        String message2 = intent.getStringExtra(Passage1.EXTRA_PASSAGE);
        TextView textView2 = findViewById(R.id.list2);
        textView.setText(message2);
        String message3 = intent.getStringExtra(Passage1.EXTRA_PASSAGE);
        TextView textView3 = findViewById(R.id.list3);
        textView.setText(message3);
    }

    public void launchPassage1(View view) {
        Intent intent = new Intent(this, Passage1.class);
        startActivity(intent);
    }

    public void launchPassage2(View view) {
        Intent intent = new Intent(this, Passage2.class);
        startActivity(intent);
    }

    public void launchPassage3(View view) {
        Intent intent = new Intent(this, Passage3.class);
        startActivity(intent);
    }


    public void openLocation(View view) {
        String loc = mLocationEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}