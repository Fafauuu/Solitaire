package com.example.solitaire

import android.widget.ImageView

class Card(
    val value: Int,
    val suit: Suit
) {
    var isFaceUp: Boolean = false

    fun flipCard() {
        isFaceUp = !isFaceUp
    }

    override fun toString(): String {
        return "Suit: $suit, value: $value, isFaceUp: $isFaceUp\n"
    }
}
