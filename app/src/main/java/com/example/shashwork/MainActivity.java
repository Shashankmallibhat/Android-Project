package com.example.shashwork;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        txt = findViewById(R.id.editTextTextEmailAddress);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newint = new Intent(MainActivity.this,NavigationActivity.class);
                newint.putExtra("Username", txt.getText().toString());
                startActivity(newint);
            }
        });
    }
}