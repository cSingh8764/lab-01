package com.example.petshop

abstract class Mood(val date: String) {

    abstract fun getMoodType(): String

    fun describe(): String{

        return "on $date, Mood: ${getMoodType()}"
    }
}