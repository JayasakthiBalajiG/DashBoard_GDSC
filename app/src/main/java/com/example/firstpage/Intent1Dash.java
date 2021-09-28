package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Intent1Dash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1_dash);

        TextView req1TextView = findViewById(R.id.req1TextView);

        req1TextView.setOnClickListener(view -> {
            Intent intent = new Intent(Intent1Dash.this, Intent1_1.class);
            startActivity(intent);
        });

        TextView req2TextView = findViewById(R.id.req2TextView);

        req2TextView.setOnClickListener(view -> {
            Intent intent = new Intent(Intent1Dash.this, Intent1_1.class);
            startActivity(intent);
        });
        TextView req3TextView = findViewById(R.id.req3TextView);

        req3TextView.setOnClickListener(view -> {
            Intent intent = new Intent(Intent1Dash.this, Intent1_1.class);
            startActivity(intent);
        });

        TextView req4TextView = findViewById(R.id.req4TextView);

        req4TextView.setOnClickListener(view -> {
            Intent intent = new Intent(Intent1Dash.this, Intent1_1.class);
            startActivity(intent);
        });
        TextView req5TextView = findViewById(R.id.req5TextView);

        req5TextView.setOnClickListener(view -> {
            Intent intent = new Intent(Intent1Dash.this, Intent1_1.class);
            startActivity(intent);
        });

        TextView req6TextView = findViewById(R.id.req6TextView);

        req6TextView.setOnClickListener(view -> {
            Intent intent = new Intent(Intent1Dash.this, Intent1_1.class);
            startActivity(intent);
        });

    }
}