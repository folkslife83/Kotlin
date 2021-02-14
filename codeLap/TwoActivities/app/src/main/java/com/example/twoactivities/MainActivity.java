package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//The Intent extras are key/value pairs in a Bundle.
public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    //define the key for the Intent extra
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";
    //variable to hold the EditText
    private EditText mMessageEditText;
    //어떤 Activity인지 식별하는 값을 넣어준다
    public static final int TEXT_REQUEST = 1;
    private TextView mReplyHeadTextView;
    private TextView mReplyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.editText_main);

        mReplyHeadTextView = findViewById(R.id.text_header_reply);
        mReplyTextView = findViewById(R.id.text_message_reply);
    }
    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String message = mMessageEditText.getText().toString();
        //EXTRA_MESSAGE constant as the key and the string as the value
        intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent); // Intent 에서 정보 넣고 꺼내는게 한방향이면 이것을 사용
        startActivityForResult(intent, TEXT_REQUEST); //양방향일때 사용
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                mReplyHeadTextView.setVisibility(View.VISIBLE);
                mReplyTextView.setText(reply);
                mReplyTextView.setVisibility(View.VISIBLE);
            }
        }
    }

    public void launchChallengeActivity(View view) {
        Log.d(LOG_TAG, "Challenge Button clicked!");
        Intent intent = new Intent(this, ChallengeActivity.class);
        startActivity(intent);
    }
}