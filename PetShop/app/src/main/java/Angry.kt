package com.example.petshop

class Angry(date: String) : Mood(date){
    override fun getMoodType(): String {
        return "Angry"
    }
}