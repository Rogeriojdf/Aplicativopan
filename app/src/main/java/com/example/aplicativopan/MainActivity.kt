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

        setContentView(R.layout.exercico_nota)

        val botaoExerc1 = findViewById<Button>(R.id.btnExerc1)
        val edtExerc1 = findViewById<EditText>(R.id.edtExec1)
        val txtExerc1 = findViewById<TextView>(R.id.txtExerc1)

        botaoExerc1.setOnClickListener {
            var numero = edtExerc1.text.toString().toFloat() * 2
            txtExerc1.text = numero.toString()
        }


    }
}