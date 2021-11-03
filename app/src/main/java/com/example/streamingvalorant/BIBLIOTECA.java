package com.example.streamingvalorant;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BIBLIOTECA extends AppCompatActivity {

    public Button volver;
    public Button streams;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca);

        volver = findViewById(R.id.Volver);
        volver.setOnClickListener(view -> {
            Intent back = new Intent(BIBLIOTECA.this, LogIn.class);
            startActivity(back);
        });

        streams = findViewById(R.id.Streams);
        streams.setOnClickListener(view -> {
            Intent next = new Intent(BIBLIOTECA.this, STREAMS.class);
            startActivity(next);
        });
    }
}