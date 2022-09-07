package com.example.myapplicationtercerbim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivitySharedPre extends AppCompatActivity {

    private EditText txtN, txtD;
    private Button btnRe, btnGra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shared_pre);
        txtN = (EditText) findViewById(R.id.txtNombreShar);
        txtD = (EditText) findViewById(R.id.txtdatosShar);
        btnGra = (Button) findViewById(R.id.btnGraShar);

        btnGra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefe = getSharedPreferences("agenda", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefe.edit();
                editor.putString(txtN.getText().toString(), txtD.getText().toString());
                editor.commit();
                Toast.makeText(MainActivitySharedPre.this, "Se grabo correctamente los datos", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void recuperar(View v){
        SharedPreferences prefe = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String d = prefe.getString(txtN.getText().toString(), "");
        if(d.length() == 0){
            Toast.makeText(this, "No existe dicho nombreen la agenda", Toast.LENGTH_SHORT).show();
        }else {
            txtD.setText(d);
        }
    }
}