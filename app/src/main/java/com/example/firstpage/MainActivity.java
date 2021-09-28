package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean clg1Display =true;

    public void fade (View view){
        Log.i("Info","Tapped");
        ImageView clg1ImageView =findViewById(R.id.clg1ImageView);
        ImageView clg2ImageView= findViewById(R.id.clg2ImageView);
        if(clg1Display){
            clg1Display=false;
            clg1ImageView.animate().alpha(0).setDuration(2000);
            clg2ImageView.animate().alpha(1).setDuration(2000);
        }
        else
        {
            clg1Display=true;
            clg1ImageView.animate().alpha(1).setDuration(2000);
            clg2ImageView.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Intent1Dash.class);
            startActivity(intent);
        });

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CreateIdAcc.class);
            startActivity(intent);
        });


    }
}