package com.example.aplicativopan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.aulaid)

        val notaP1 = findViewById<EditText>(R.id.editNota1)
        val notaP2 = findViewById<EditText>(R.id.editNota2)
        val resultado = findViewById<TextView>(R.id.txtResultado)
        val botao = findViewById<Button>(R.id.btnCalcular)

        botao.setOnClickListener {
            resultado.text = "Media é: " + ((notaP1.text.toString().toFloat()
                    + notaP2.text.toString().toFloat()) / 2).toString()

        }

        val peso = findViewById<EditText>(R.id.editPeso)
        val altura = findViewById<EditText>(R.id.editAltura)
        val resultadoimc = findViewById<TextView>(R.id.txtResultadoImc)
        val botaoimc = findViewById<Button>(R.id.btnImc)

        botaoimc.setOnClickListener {
            val multiplica = (altura.text.toString().toFloat() * altura.text.toString().toFloat())
            val imc = (peso.text.toString().toFloat()) / multiplica
            resultadoimc.text = imc.toString()

        }



    }
}