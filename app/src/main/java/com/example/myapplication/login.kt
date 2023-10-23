package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_pindah = findViewById<Button>(R.id.L_btn_1)

        btn_pindah.setOnClickListener {
            val IntentPindah =
                Intent (this, home ::class.java)

            startActivity(IntentPindah)
        }

        val btn_register = findViewById<TextView>(R.id.txt_signup)

        btn_register.setOnClickListener {
            val IntentRegister =
                Intent (this, register ::class.java)

            startActivity(IntentRegister)
        }

        val btn_back = findViewById<ImageView>(R.id.bck)

        btn_back.setOnClickListener {
            val IntentRegister =
                Intent (this, MainActivity ::class.java)

            startActivity(IntentRegister)
        }

    }


}

