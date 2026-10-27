package com.example.console

class Baralho {
    private val cartas = mutableListOf<Carta>()

    init {
        for (naipe in Naipe.values()) {
            for (valor in Valor.values()) {
                cartas.add(Carta(valor, naipe))
            }
        }
    }