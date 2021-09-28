package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Intent1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent11);

        Button accButton = findViewById(R.id.accButton);

        accButton.setOnClickListener(view -> {
            Intent intent = new Intent(Intent1_1.this, Login.class);
            startActivity(intent);
        });
    }
}