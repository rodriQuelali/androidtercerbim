package com.example.myapplicationtercerbim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivitylistaAgenda extends AppCompatActivity {

    private ListView lv;
    private ArrayList<String> datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylista_agenda);
        lv = (ListView) findViewById(R.id.listAgenda);

        datos = new ArrayList<String>();
        SharedPreferences prefe = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        Map<String, ?> AgenDato = prefe.getAll();
        for (Map.Entry<String,?> ele:AgenDato.entrySet()){
            datos.add(ele.getKey() + " ; " + ele.getValue().toString());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lv.setAdapter(adapter);
    }
}