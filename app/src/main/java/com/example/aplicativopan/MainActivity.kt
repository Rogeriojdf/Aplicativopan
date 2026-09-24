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

        val botaoExerc2 = findViewById<Button>(R.id.btnExerc2)
        val edtExerc2 = findViewById<EditText>(R.id.edtExec2)
        val txtExerc2 = findViewById<TextView>(R.id.txtExerc2)

        botaoExerc2.setOnClickListener {
            var idade = edtExerc2.text.toString().toInt() * 365
            txtExerc2.text = "Você já viveu aproximadamente " + idade.toString() + " dias"
        }

        val botaoExerc3 = findViewById<Button>(R.id.btnExerc3)
        val edtExerc3 = findViewById<EditText>(R.id.edtExec3)
        val txtExerc3 = findViewById<TextView>(R.id.txtExerc3)

        botaoExerc3.setOnClickListener {
            var conta= edtExerc3.text.toString().toDouble() * 0.1
            txtExerc3.text = "Valor com desconto (10%) = " + conta.toString() + " reais"
        }

        val botaoExerc4 = findViewById<Button>(R.id.btnExerc4)
        val edtExerc4 = findViewById<EditText>(R.id.edtExec4)
        val txtExerc4 = findViewById<TextView>(R.id.txtExerc4)

        botaoExerc4.setOnClickListener {
            var dolar= edtExerc4.text.toString().toDouble() * 5
            txtExerc4.text = "Valor da conversão é R$ " + dolar.toString().toDouble()
        }

        val notaP1 = findViewById<EditText>(R.id.edtN1)
        val notaP2 = findViewById<EditText>(R.id.edtN2)
        val media = findViewById<TextView>(R.id.txtExerc5)
        val botao5 = findViewById<Button>(R.id.btnMedia)

        botao5.setOnClickListener {
            media.text = "Media é: " + ((notaP1.text.toString().toDouble()
                    + notaP2.text.toString().toDouble()) / 2).toString()
        }

        val idadeg = findViewById<EditText>(R.id.edtExec6Idadeg)
        val resultadoimc = findViewById<TextView>(R.id.txtResultadoImc)
        val botaoExerc6 = findViewById<Button>(R.id.btnExerc6Imc)

        botaoExerc6.setOnClickListener {

            val imc = (idadeg.text.toString().toFloat()) / multiplica
            resultadoimc.text = "IMC é: " + imc.toString()

            if (imc <18.5)
            {
                resultadoimc.text = imc.toString() + " Abaixo do peso"
            }else if(imc >= 18.5 && imc <= 24.9) {
                resultadoimc.text = imc.toString() + " Peso Normal"
            }
            else if(imc >= 25 && imc <= 29.9) {
                resultadoimc.text = imc.toString() + " Sobrepeso"
            }else {
                resultadoimc.text = imc.toString() + " Obesidade"
            }
    }
}