package com.example.guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button VerLista;
    Button AggNombre;
    Button VerDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VerLista = (Button)findViewById(R.id.btnverLista);
        AggNombre = (Button)findViewById(R.id.btnAggNombres);
        VerDatos = (Button)findViewById(R.id.btnMisDatos);
//*********
        VerLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Lista.class);
                startActivity(i);
            }
        });
//*********
        AggNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AggNombres.class);
                startActivity(i);
            }
        });
//*********
        VerDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Datos.class);
                startActivity(i);
            }
        });

    }
}