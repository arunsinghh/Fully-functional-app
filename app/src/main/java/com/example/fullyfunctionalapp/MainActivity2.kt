package com.example.fullyfunctionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val cardview=findViewById<CardView>(R.id.card1)

        cardview.setOnClickListener {
            val int=Intent(this, MainAndroid::class.java)
            startActivity(int)
        }

        val cardview1=findViewById<CardView>(R.id.card2)

        cardview1.setOnClickListener {
            val int=Intent(this, MainWeb::class.java)
            startActivity(int)
        }

        val cardview2= findViewById<CardView>(R.id.card3)

        cardview2.setOnClickListener {
            val int=Intent(this, MainIOS::class.java)
            startActivity(int)
        }

        val cardview3= findViewById<CardView>(R.id.card4)

        cardview3.setOnClickListener {
            val int=Intent(this, MainMachineLearning::class.java)
            startActivity(int)
        }

        val cardview4= findViewById<CardView>(R.id.card5)

        cardview4.setOnClickListener {
            val int=Intent(this, MainBlockChain::class.java)
            startActivity(int)
        }

        val cardview5= findViewById<CardView>(R.id.card6)

        cardview5.setOnClickListener {
            val int=Intent(this, MainAi::class.java)
            startActivity(int)
        }

        val callbutton= findViewById<Button>(R.id.call)

        callbutton.setOnClickListener {
            val int=Intent(Intent.ACTION_DIAL)
            startActivity(int)
        }
    }
}