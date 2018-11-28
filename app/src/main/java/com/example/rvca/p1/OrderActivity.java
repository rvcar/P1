package com.example.rvca.p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        t = findViewById(R.id.textViewOrder);

        t.setText(String.valueOf(getIntent().getDoubleExtra("length", 1)));

    }
}
