package com.example.streamingvalorant;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class STREAMS extends AppCompatActivity {

    public Button volver;
    public Button biblio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streams);

        volver = findViewById(R.id.volver);
        volver.setOnClickListener(view -> {
            Intent back = new Intent(STREAMS.this, LogIn.class);
            startActivity(back);
        });

        biblio = findViewById(R.id.biblio);
        biblio.setOnClickListener(view -> {
            Intent next = new Intent(STREAMS.this, BIBLIOTECA.class);
            startActivity(next);
        });
    }
}