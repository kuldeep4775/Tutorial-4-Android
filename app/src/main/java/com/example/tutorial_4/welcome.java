package com.example.tutorial_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class welcome extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        t1 = findViewById(R.id.t1);

        String s1 = getIntent().getStringExtra("hello");
        t1.setText("welcpme : "+ s1);

    }
}