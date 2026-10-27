package com.example.console


class Jogador(val nome: String) {
    private val mao = mutableListOf<Carta>()
    fun receber(carta: Carta) {
        mao.add(carta)
    }
    fun mostrarMao() {
        println("$nome: $mao")
    }
}