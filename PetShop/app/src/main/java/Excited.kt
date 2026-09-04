package com.example.petshop

class Excited(date: String) : Mood(date){
    override fun getMoodType(): String{
        return "Excited"
    }
}