package com.example.myapplicationtercerbim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityProblemaSueldo extends AppCompatActivity {

    private EditText etSul1, etSul2, etSul3;
    private TextView tvSul;
    private Button btnResu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_problema_sueldo);

        etSul1 = (EditText) findViewById(R.id.etSul1);
        etSul2 = (EditText) findViewById(R.id.etSul2);
        etSul3 = (EditText) findViewById(R.id.etSul3);
        tvSul = (TextView) findViewById(R.id.tv3ResSul);
        btnResu = (Button) findViewById(R.id.btnResSul);

        btnResu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validacion de datos [1000 - 50000]
                if(Integer.parseInt(etSul1.getText().toString()) > 1000 && Integer.parseInt(etSul2.getText().toString()) > 1000 && Integer.parseInt(etSul3.getText().toString()) > 1000
                        && Integer.parseInt(etSul1.getText().toString()) < 40000 && Integer.parseInt(etSul2.getText().toString()) < 40000 && Integer.parseInt(etSul3.getText().toString()) < 40000){
                    //logica de para encontrar el sueldo de l medio de 3 sueldos
                    if(Integer.parseInt(etSul1.getText().toString()) > Integer.parseInt(etSul2.getText().toString()) && Integer.parseInt(etSul1.getText().toString()) > Integer.parseInt(etSul3.getText().toString())){
                        if(Integer.parseInt(etSul2.getText().toString()) > Integer.parseInt(etSul3.getText().toString())){
                            tvSul.setText(etSul2.getText().toString());
                        }else {
                            tvSul.setText(etSul3.getText().toString());
                        }
                    }else if(Integer.parseInt(etSul2.getText().toString()) > Integer.parseInt(etSul1.getText().toString()) && Integer.parseInt(etSul2.getText().toString()) > Integer.parseInt(etSul3.getText().toString())){
                        if(Integer.parseInt(etSul1.getText().toString()) > Integer.parseInt(etSul3.getText().toString())){
                            tvSul.setText(etSul1.getText().toString());
                        }else {
                            tvSul.setText(etSul3.getText().toString());
                        }
                    }else {
                        if(Integer.parseInt(etSul1.getText().toString()) > Integer.parseInt(etSul2.getText().toString())){
                            tvSul.setText(etSul1.getText().toString());
                        }else {
                            tvSul.setText(etSul2.getText().toString());
                        }
                    }
                }else {
                    Toast.makeText(MainActivityProblemaSueldo.this, "Solo se aceptan valor de 1000  a 40000", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}