package com.example.myapplicationtercerbim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivitylistaAgenda extends AppCompatActivity {

    private ListView lv;
    private ArrayList<String> datos;
    private ArrayList<String> listaAgendaEspe;
    private TextView tvView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylista_agenda);
        lv = (ListView) findViewById(R.id.listAgenda);
        tvView = (TextView) findViewById(R.id.tvVistaListaAgenda);

        datos = new ArrayList<String>();
        listaAgendaEspe = new ArrayList<String>();

        SharedPreferences prefe = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        Map<String, ?> AgenDato = prefe.getAll();
        for (Map.Entry<String,?> ele:AgenDato.entrySet()){
            datos.add(ele.getKey());
            listaAgendaEspe.add(ele.getValue().toString());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tvView.setText("Su numero de Telefono de " + lv.getItemAtPosition(i) + " es : " + listaAgendaEspe.get(i));
            }
        });
    }
}