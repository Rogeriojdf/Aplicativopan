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
            
            txtExerc3.text = "Valor com desconto (10%) = " + ("R$ %.2f", conta)
        }

        val botaoExerc4 = findViewById<Button>(R.id.btnExerc4)
        val edtExerc4 = findViewById<EditText>(R.id.edtExec4)
        val txtExerc4 = findViewById<TextView>(R.id.txtExerc4)

        botaoExerc4.setOnClickListener {
            var dolar= edtExerc4.text.toString().toDouble() * 5
            txtExerc4.text = "Valor da conversão é R$ " + ("R$ %.2f", dolar)
        }

        val notaP1 = findViewById<EditText>(R.id.edtN1)
        val notaP2 = findViewById<EditText>(R.id.edtN2)
        val media = findViewById<TextView>(R.id.txtExerc5)
        val botao5 = findViewById<Button>(R.id.btnMedia)

        botao5.setOnClickListener {
            media.text = "Media é: " + ((notaP1.text.toString().toDouble()
                    + notaP2.text.toString().toDouble()) / 2).toString()
        }

            val edtExerc6 = findViewById<EditText>(R.id.edtExec6)
            val botaoExerc6 = findViewById<Button>(R.id.btnExerc6)
            val txtExerc6 = findViewById<TextView>(R.id.txtExerc6)


            botaoExerc6.setOnClickListener {
                val texto = edtExerc6.text.toString()
                if (texto.isNotEmpty()) {
                    val idadeC = texto.toInt()
                    val categoria = if (idadeC < 12) {
                        "Criança"
                    } else if (idadeC >= 12 && idadeC < 17) {
                        "Adolescente"
                    } else if (idadeC >= 18 && idadeC < 59) {
                        "Adulto"
                    } else {
                        "Idoso"
                    }
                    txtExerc6.text = "Resultado: $categoria"
                } else {
                    txtExerc6.text = "Resultado: Digite a idade."
                }
            }
        val compra = findViewById<EditText>(R.id.edtExec7)
        val btnCalDesconto = findViewById<Button>(R.id.btnExerc7)
        val txtResulDesconto = findViewById<TextView>(R.id.txtExerc7)

        btnCalDesconto.setOnClickListener {
            val texto = compra.text.toString()
            if (texto.isNotEmpty()) {
                val valorCompra = texto.toDouble()

                val descontoPercentual: Int
                val valorFinal: Double
                if (valorCompra < 100.0) {
                    descontoPercentual = 0
                    valorFinal = valorCompra
                }
                else if
                    (valorCompra < 300.0){
                    descontoPercentual = 5
                    valorFinal = valorCompra * 0.95
                }
                else if (valorCompra < 500.0) {
                    descontoPercentual = 10
                    valorFinal = valorCompra * 0.90
                }
                else{
                    descontoPercentual = 15
                    valorFinal = valorCompra * 0.85
                }

                txtResulDesconto.text = "Desconto: $descontoPercentual% | Total: R$ ${String.format("%.2f", valorFinal)}"
            } else {
                txtResulDesconto.text = "Resultado: Digite o valor da compra."
            }
        }

    }
}
