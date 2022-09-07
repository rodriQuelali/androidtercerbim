package com.example.myapplicationtercerbim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        val btnsumKt = findViewById<Button>(R.id.btnSumKt)
        val btnsumJava = findViewById<Button>(R.id.btnSumaJava)
        val btncalSu = findViewById<Button>(R.id.btnCalcuSuel)
        val btnWeb = findViewById<Button>(R.id.btnWeb)
        val btnAbriSha = findViewById<Button>(R.id.btnAbirShar);
        //abir activitys
        btnsumKt.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        btnsumJava.setOnClickListener {
            val i = Intent(this, proyectjava::class.java)
            startActivity(i)
        }
        btncalSu.setOnClickListener {
            val i = Intent(this, MainActivityProblemaSueldo::class.java)
            startActivity(i)
        }

        btnWeb.setOnClickListener {
            val i = Intent(this, MainActivityLanzarJava::class.java)
            startActivity(i)
        }
        btnAbriSha.setOnClickListener {
            val i= Intent(this, MainActivitySharedPre::class.java)
            startActivity(i)
        }
    }
}