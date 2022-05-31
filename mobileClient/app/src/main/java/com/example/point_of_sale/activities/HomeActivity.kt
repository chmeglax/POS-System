package com.example.point_of_sale.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.point_of_sale.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val viewReceiptsCard = findViewById<CardView>(R.id.viewReceipts)
        val startOrderCard = findViewById<CardView>(R.id.startOrder)


        startOrderCard.setOnClickListener{
            intent = Intent(this, OrderActivity::class.java )
            startActivity(intent)

        }

    }
}