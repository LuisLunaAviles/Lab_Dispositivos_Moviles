package com.example.evaluacion_gg17i04001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnNewStudent;
    Button btnListStudent;
    Button btnMyData;
    public  static List<Estudiante> lista = new ArrayList<>(); //hacer una lista global


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNewStudent = findViewById(R.id.btnNew);
        btnListStudent = findViewById(R.id.btnList);
        btnMyData = findViewById(R.id.btnData);

        btnNewStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(MainActivity.this,NewStudentActivity.class);
                startActivity(intencion);
            }
        });
        btnListStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ListStudentActivity.class);
                startActivity(i);
            }
        });
        btnMyData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(MainActivity.this, MyDataActivity.class);
                startActivity(intencion);
            }
        });
    }
}