package com.example.zadanie_mobilne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dopisz = findViewById<Button>(R.id.dopisz)
        val przywroc = findViewById<Button>(R.id.przywroc)
        val tekst = findViewById<TextView>(R.id.imie_nazwisko)
        val wpisz = findViewById<EditText>(R.id.wpisz)

        dopisz.setOnClickListener {
            tekst.text = tekst.text.toString() + wpisz.text
        }
        przywroc.setOnClickListener {
            tekst.text = "Oskar Świderski"
        }
    }
}