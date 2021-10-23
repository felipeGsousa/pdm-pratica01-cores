package com.example.cores

import android.graphics.Color

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textViewMensagem: TextView
    private lateinit var tela: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.textViewMensagem = findViewById(R.id.rgbValues)
        this.tela = findViewById(R.id.tela)
    }

    fun onClick(view: View){
        var cores: String
        var separaCores: ArrayList<String>

        cores = GeraCores().toString()

        this.textViewMensagem.text = cores.subSequence(1, cores.length-1).toString().replace(",","")

        separaCores = this.textViewMensagem.text.split(" ") as ArrayList<String>

        var red = separaCores[0]
        var green = separaCores[1]
        var blue = separaCores[2]

        this.tela.setBackgroundColor(Color.rgb(red.toInt(), green.toInt(), blue.toInt()))
    }
}