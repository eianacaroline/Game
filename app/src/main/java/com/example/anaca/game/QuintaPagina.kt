package com.example.anaca.game

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quinta_pagina.*

class QuintaPagina : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quinta_pagina)

        IniciaApp.comunicacaoBT.SetTxtReceber(txtVida)




        var vida:String=txtVida.text.toString()
        if (vida == "999"){
            Toast.makeText(applicationContext, "morreu", Toast.LENGTH_LONG).show()
            //val intent = Intent(
              //      this,
               //     SextaPagina::class.java
            //)
            //startActivity(intent)
        }
    }


    fun Click(view: View) {

        var intent: Intent = Intent(this,SextaPagina::class.java)
        startActivity(intent)
    }

    fun Click1(view: View) {

        var intent: Intent = Intent(this,QuartaPagina::class.java)
        startActivity(intent)
    }
    fun Click2(view: View) {

        var intent: Intent = Intent(this,SetimaPagina::class.java)
        startActivity(intent)
    }
}