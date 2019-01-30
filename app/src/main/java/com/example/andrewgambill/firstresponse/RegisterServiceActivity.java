package com.example.andrewgambill.firstresponse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterServiceActivity extends AppCompatActivity {

    private EditText titleEditText;
    private EditText descriptionEditText;
    private EditText keywordEditText;
    private Button clearButton,submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_service);

        titleEditText = (EditText)findViewById(R.id.titleEditText);
        descriptionEditText = (EditText)findViewById(R.id.descriptionEditText);
        keywordEditText = (EditText)findViewById(R.id.keywordEditText);
        clearButton = (Button)findViewById(R.id.clearButton);
        submitButton = (Button)findViewById(R.id.submitButton);

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
