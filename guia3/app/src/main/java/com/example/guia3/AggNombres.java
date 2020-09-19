package com.example.guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class AggNombres extends AppCompatActivity {

    public static String d;
    EditText Nombre;
    Button Guardar;
    ProgressBar PR;
    Timer timer = new Timer();
    boolean x = true;
    //private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agg_nombres);

        Nombre = (EditText) findViewById(R.id.etNombre);
        PR = (ProgressBar) findViewById(R.id.PR);
        Guardar = (Button) findViewById(R.id.btnGuardar);

        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardaN();
                for (int i=0; i<=100; i++){
                    PR.setProgress(i, x);
                    if (i == 100){
                        finish();
                    }
                }

            }
        });


     //   lista = (ListView) findViewById(R.id.lts);



    }

    public String guardaN(){
       /* ArrayList<Nombre> lts = new ArrayList<Nombre>();
        lts.add(new Nombre(Nombre.getText().toString()));
        ArrayAdapter<Nombre> x = new ArrayAdapter<Nombre>(this, android.R.layout.simple_list_item_1);
        lista.setAdapter(x);
        x.notifyDataSetChanged();*

        */
       d = Nombre.getText().toString();

       return d;
    }

}