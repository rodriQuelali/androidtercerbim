package com.example.myapplicationtercerbim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityLanzarJava extends AppCompatActivity {
    private EditText txtweb;
    private Button btnlanzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lanzar_java);

        txtweb = (EditText) findViewById(R.id.txtWebjava);
        btnlanzar = (Button) findViewById(R.id.btnWeb2java);

        //segunda forma que es directo su metod onclick
        btnlanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivityLanzarJava.this, MainActivityrecivido.class);
                i.putExtra("direccion", txtweb.getText().toString());
                startActivity(i);
            }
        });


    }

    //primera forma--- clasica
    public void lanzar (View v){
        Intent i = new Intent(this, MainActivityrecivido.class);
        i.putExtra("direccio", txtweb.getText().toString());
        startActivity(i);
    }
}