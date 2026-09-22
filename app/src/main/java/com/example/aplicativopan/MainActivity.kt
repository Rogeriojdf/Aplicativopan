package com.example.aplicativopan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.aulaid)

        val oi="ii"
        val botao = findViewById<Button>(R.id.btnProximo)
        val texto = findViewById<EditText>(R.id.editValor)

        botao.text = "Novo texto"

        botao.setOnClickListener {
            botao.text = texto.text
        }
    }
}