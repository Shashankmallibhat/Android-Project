package com.example.shashwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    String[] language = {"Male", "Female", "Other"};
    ImageButton btn;
    TextView datetext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        datetext = findViewById(R.id.textView3);
        btn = findViewById(R.id.imageButton2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navint = new Intent(MainActivity3.this,NavigationActivity.class);
                startActivity(navint);
            }
        });
    }
}