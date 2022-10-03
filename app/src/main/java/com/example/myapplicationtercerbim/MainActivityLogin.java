package com.example.myapplicationtercerbim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityLogin extends AppCompatActivity {

    private Button btnIngre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        btnIngre = (Button) findViewById(R.id.btnIngre);

        btnIngre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivityLogin.this, Principal.class);
                startActivity(i);
            }
        });
    }
}