package com.example.evaluacion_gg17i04001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListStudentActivity extends AppCompatActivity {
     private ListView list;
     private  EstudianteAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_student);
        list = findViewById(R.id.list);



        adapter = new EstudianteAdapter(MainActivity.lista,this);

        list.setAdapter(adapter);




    }
}