package com.example.evaluacion_gg17i04001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewStudentActivity extends AppCompatActivity {
    EditText Nombre,Codigo,Materia,Parcial1,Parcial2,Parcial3;
    Button btnGuardar;
    private   String n,c,m;
    private   double p,s,t;
    public static boolean yes = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_student);
        Nombre = findViewById(R.id.etName);
        Codigo = findViewById(R.id.etCod);
        Materia = findViewById(R.id.etMateria);
        Parcial1 = findViewById(R.id.etOne);
        Parcial2 = findViewById(R.id.etTwo);
        Parcial3 = findViewById(R.id.etThree);
        btnGuardar = findViewById(R.id.btn_Guardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n= Nombre.getText().toString();
                c= Codigo.getText().toString();
                m= Materia.getText().toString();
                p= Double.parseDouble(Parcial1.getText().toString());
                s= Double.parseDouble(Parcial2.getText().toString());
                t= Double.parseDouble(Parcial3.getText().toString());
                yes = true;
                Estudiante e = new Estudiante(n,c,m,p,s,t);
                MainActivity.lista.add(e);
                Toast.makeText(NewStudentActivity.this, "Ingresado correctamente", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}