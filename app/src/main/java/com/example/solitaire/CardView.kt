package com.example.solitaire

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.FrameLayout
import android.widget.ImageView

class CardView(context: Context, attrs: AttributeSet): FrameLayout(context, attrs) {
    private val imageView = ImageView(context).apply {
        scaleType = ImageView.ScaleType.CENTER_INSIDE
    }

    init {
        imageView.setImageResource(R.drawable.card_back)
        imageView.setOnClickListener {
            card?.flipCard()
            updateImage()
        }
        addView(imageView)
    }

    var card: Card? = null

    set(value) {
        field = value
        updateImage()
    }

    private fun updateImage() {
        val card = card ?: return
        val id = if (card.isFaceUp) {
            context.resources.getIdentifier("${card.suit.name.lowercase()}_${card.value}", "drawable", context.packageName)
        } else {
            R.drawable.card_back
        }
        imageView.setImageResource(id)
    }
}