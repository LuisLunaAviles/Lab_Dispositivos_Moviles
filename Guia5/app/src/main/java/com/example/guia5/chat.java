package com.example.guia5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class chat extends AppCompatActivity {

    ListView chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        chat = (ListView)findViewById(R.id.chat);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        String elemento[] = {"Marina", "Larissa", "Luis", "Juan","Miguel","Maria","Melissa"};
        adaptador.addAll(elemento);
        chat.setAdapter(adaptador);

        adaptador.notifyDataSetChanged();

    }
}