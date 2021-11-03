package com.example.streamingvalorant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class LogIn extends AppCompatActivity {
    public Button registrar;
    String url = "https://playvalorant.com/es-es/";

    public TextView user;
    public TextView pass;
    public Button go;
    String Usuario;
    String Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Iniciar Sesion
        user = findViewById(R.id.usuario);
        pass = findViewById(R.id.contraseña);
        go = findViewById(R.id.Go);
        go.setOnClickListener(view -> {
           Usuario = user.getText().toString();
           Password = pass.getText().toString();

           if ((Usuario.equals("Interfaces")) && (Password.equals("ProyectoG6"))){
               mostrarDialogo();
           } else {
               Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrecta!", Toast.LENGTH_SHORT).show();
           }
        });

        //Registrarse
        registrar = findViewById(R.id.Registrar);
        registrar.setOnClickListener(view -> {
        Uri link = Uri.parse(url);
        Intent i = new Intent(Intent.ACTION_VIEW,link);
        startActivity(i);
        });
    }


    public void mostrarDialogo(){
        new AlertDialog.Builder(this)
                .setTitle("BIENVENIDO "+Usuario)
                .setMessage("SELECCIONE: ")
                .setNegativeButton("STREAMS", (dialogInterface, i) -> {
                    Intent stream = new Intent(LogIn.this,STREAMS.class);
                    startActivity(stream);
                }).setPositiveButton("BIBLIOTECA", (dialogInterface, i) -> {
                    Intent biblio = new Intent(LogIn.this, BIBLIOTECA.class);
                    startActivity(biblio);
                })
                .show();
    }
}