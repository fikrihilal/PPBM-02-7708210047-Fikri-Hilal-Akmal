package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout

class home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn_pindah = findViewById<RelativeLayout>(R.id.about)

        btn_pindah.setOnClickListener {
            val IntentPindah =
                Intent(this, about::class.java)

            startActivity(IntentPindah)
        }

        val btn_profile = findViewById<RelativeLayout>(R.id.btn_profile)

        btn_profile.setOnClickListener {
            val IntentRegister =
                Intent(this, profile::class.java)

            startActivity(IntentRegister)
        }

        val btn_location = findViewById<RelativeLayout>(R.id.location)

        btn_location.setOnClickListener {
            val IntentRegister =
                Intent(this, location::class.java)

            startActivity(IntentRegister)
        }

        val btn_service = findViewById<RelativeLayout>(R.id.service)

        btn_service.setOnClickListener {
            val IntentRegister =
                Intent(this, service::class.java)

            startActivity(IntentRegister)
        }

        val btn_discount = findViewById<RelativeLayout>(R.id.discount)

        btn_discount.setOnClickListener {
            val IntentRegister =
                Intent(this, discount::class.java)

            startActivity(IntentRegister)
        }
    }






}

