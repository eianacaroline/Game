package com.example.anaca.game

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class SegundaPagina : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_pagina)}

    fun Click(view: View) {

        val intent: Intent = Intent(this,DecimaPagina::class.java)
        startActivity(intent)
    }
    fun Click1(view: View) {
        val ch = 'm'
        val bt = ch.toByte()
        //ESSA INSTRUÇÃO MANDA COMANDOS PARA O ARDUINO
        IniciaApp.comunicacaoBT!!.write(bt)

        val intent: Intent = Intent(this,QuintaPagina::class.java)
        startActivity(intent)
    }
}