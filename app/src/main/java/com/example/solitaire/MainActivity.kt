package com.example.solitaire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.solitaire.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val hearts2Card = Card(2, Suit.HEARTS)
        hearts2Card.flipCard()

        val clubs3Card = Card(3, Suit.CLUBS)
        clubs3Card.flipCard()

        binding.cvFirstDeckCard.card = hearts2Card
        binding.cvThirdDeckCard.card = clubs3Card
    }
}