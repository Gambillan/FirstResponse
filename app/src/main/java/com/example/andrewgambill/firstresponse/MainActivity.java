package com.example.andrewgambill.firstresponse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button checkInButton;
    private Button findUserButton;
    private Button registerServiceButton;
    private Button findServiceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkInButton = (Button)findViewById(R.id.checkInButton);
        findUserButton = (Button)findViewById(R.id.findUserButton);
        registerServiceButton = (Button)findViewById(R.id.registerServiceButton);
        findServiceButton = (Button)findViewById(R.id.findServiceButton);

        checkInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CheckInActivity.class);
                startActivity(intent);
            }
        });

        findUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FindUserActivity.class);
                startActivity(intent);
            }
        });

        registerServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegisterServiceActivity.class);
                startActivity(intent);
            }
        });

        findServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FindServiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
