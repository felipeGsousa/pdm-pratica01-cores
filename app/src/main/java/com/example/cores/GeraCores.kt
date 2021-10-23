package com.example.cores

import kotlin.random.Random

class GeraCores {
    private var cores: ArrayList<Int>;

    constructor(){
        this.cores = ArrayList();
        this.setCores();
    }

    private fun setCores(){
        while (cores.size < 3){
            cores.add(Random.nextInt(0,255))
        }
    }

    override fun toString(): String {
        return this.cores.toString()
    }
}