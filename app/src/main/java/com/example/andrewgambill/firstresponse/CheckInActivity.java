package com.example.andrewgambill.firstresponse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CheckInActivity extends AppCompatActivity {
    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private EditText ageEditText;
    private Button chooseLocationButton;
    private Button takePhotoButton;
    private Button clearButton;
    private Button submitButton;
    private TextView textView,textView2;
    private static final int REQUEST_CAMERARESULT=201;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);

        firstNameEditText = (EditText)findViewById(R.id.searchEditText);
        lastNameEditText = (EditText)findViewById(R.id.lastNameEditText);
        ageEditText = (EditText)findViewById(R.id.ageEditText);
        chooseLocationButton = (Button)findViewById(R.id.chooseLocationButton);
        takePhotoButton = (Button)findViewById(R.id.takePhotoButton);
        clearButton = (Button)findViewById(R.id.clearButton);
        submitButton = (Button)findViewById(R.id.submitButton);
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
       double lat = intent.getDoubleExtra("lat", 0);
       double longitude = intent.getDoubleExtra("long", 0);
       textView.setText("Lat: " + lat);
       textView2.setText("Longitude: " + longitude);


        chooseLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckInActivity.this,ChooseLocationActivity.class);
                startActivity(intent);
            }
        });

        takePhotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        

    }
}
