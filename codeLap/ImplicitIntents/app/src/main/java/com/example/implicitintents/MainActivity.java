package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
//To allow an Activity to receive an implicit Intent,
// you define an Intent filter in your app's AndroidManifest.xml file
// to indicate which types of implicit Intent your Activity is interested in handling.
public class MainActivity extends AppCompatActivity {
    private EditText mWebsiteEditText;
    private EditText mLocationEditText;
    private EditText mShareTextEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebsiteEditText = findViewById(R.id.website_edittext);
        mLocationEditText = findViewById(R.id.location_edittext);
        mShareTextEditText = findViewById(R.id.share_edittext);

    }

    public void openWebsite(View view) {

        String url = mWebsiteEditText.getText().toString();
        Uri webpage = Uri.parse(url);
        // specify an action, not context/specific component as in Explicit intent
        // ACTION_VIEW (to view the given data)
        // ACTION_EDIT (to edit the given data)
        // ACTION_DIAL (to dial a phone number)
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        // Intent filters 와 intent가 일치하는지 확인
        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            Log.d("ImplicitIntents", "Can handle openWebsite!");
            startActivity(intent);

        } else {
            Log.d("ImplicitIntents", "Can't handle openWebsite!");
        }
    }

    public void openLocation(View view) {
        String loc = mLocationEditText.getText().toString();
        // Parse that string into a Uri object with a geo search query
        // Parse the location and create the intent.
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void shareText(View view) {
        String txt = mShareTextEditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)  // The Activity that launches this share Intent (this).
                .setType(mimeType) // The MIME type of the item to be shared.
                .setChooserTitle(R.string.share_text_with) //The title that appears on the system app chooser.
                .setText(txt) // The actual text to be shared
                .startChooser(); // Show the system app chooser and send the Intent.
    }
}