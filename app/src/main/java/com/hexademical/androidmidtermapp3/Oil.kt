package com.hexademical.androidmidtermapp3

class Oil(name: String, price: Double) {
    private val name = name;
    private val price = price;

    fun getOilName(): String {
        return this.name;
    }

    fun getOilPrice(): Double {
        return this.price;
    }

}