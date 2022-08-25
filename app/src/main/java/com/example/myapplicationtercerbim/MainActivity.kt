package com.example.myapplicationtercerbim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val btnsuma = findViewById<Button>(R.id.btnSumar)
        val et1 = findViewById<EditText>(R.id.et1kt)
        val et2 = findViewById<EditText>(R.id.et2kt)
        val tv3 = findViewById<TextView>(R.id.tv3kt)

        //Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()

        //boton de abrir un nuevo activity
        btn.setOnClickListener {
            val i = Intent(this, proyectjava::class.java)
            startActivity(i)
        }

        //metodo de onclick del boton.
        btnsuma.setOnClickListener {
            tv3.setText(et1.text.toString().toInt() + et2.text.toString().toInt());
        }
    }

    //alertas en android studio
    //Toast
    /*
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }*/
}