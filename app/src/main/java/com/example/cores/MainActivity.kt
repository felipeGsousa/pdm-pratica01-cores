package com.example.cores

import android.graphics.Color

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var geraCores = GeraCores()
    private lateinit var textViewMensagem: TextView
    private lateinit var tela: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.textViewMensagem = findViewById(R.id.rgbValues)
        this.tela = findViewById(R.id.tela)
    }

    fun onClick(view: View){
        var cores: ArrayList<Int>

        cores = this.geraCores.setCores()

        this.textViewMensagem.text = cores[0].toString() + " " + cores[1].toString() + " " + cores[2].toString()

        this.tela.setBackgroundColor(Color.rgb(cores[0], cores[1], cores[2]))
    }
}