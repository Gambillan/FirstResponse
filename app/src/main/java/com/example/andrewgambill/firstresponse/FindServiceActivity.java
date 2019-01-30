package com.example.andrewgambill.firstresponse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FindServiceActivity extends AppCompatActivity {

    private EditText searchEditText;
    private Button clearButton;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_service);

        searchEditText = (EditText)findViewById(R.id.searchEditText);
        clearButton = (Button)findViewById(R.id.clearButton);
        searchButton = (Button)findViewById(R.id.searchButton);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
