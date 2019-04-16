package com.example.anaca.game

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.URL

class TelaSala : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_sala2)
    }


    fun ClickVolta(view: View) {

        var intent: Intent = Intent(this,DecimaPagina::class.java)
        startActivity(intent)
    }
    fun ClickPronto (view: View) {

        var intent: Intent = Intent(this,DecimaPrimeiraPagina::class.java)
        startActivity(intent)

    }
    fun ClickCodigo(view: View) {

        var intent: Intent = Intent(this,DecimaPrimeiraPagina::class.java)
        startActivity(intent)

    }

}
