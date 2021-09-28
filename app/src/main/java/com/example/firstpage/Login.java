package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button LoginButton = findViewById(R.id.VerifyOtp);

        LoginButton.setOnClickListener(view -> {
            Intent intent = new Intent(Login.this, OTP.class);
            startActivity(intent);
        });
    }
}