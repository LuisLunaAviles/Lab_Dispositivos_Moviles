package com.example.guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {


    String Nombre = AggNombres.d;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lista = (ListView) findViewById(R.id.lts);
        ArrayAdapter<Nombre> adaptador = new ArrayAdapter<Nombre>(this, android.R.layout.simple_list_item_1);
        adaptador.add(new Nombre(Nombre));
        lista.setAdapter(adaptador);
        adaptador.notifyDataSetChanged();



    }
}