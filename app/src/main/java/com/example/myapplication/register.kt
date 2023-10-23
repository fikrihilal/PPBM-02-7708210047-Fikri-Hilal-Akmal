package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class register : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn_pindah = findViewById<Button>(R.id.R_btn_1)

        btn_pindah.setOnClickListener {
            val IntentPindah =
                Intent (this, home ::class.java)

            startActivity(IntentPindah)
        }

        val btn_back = findViewById<ImageView>(R.id.A_back)

        btn_back.setOnClickListener {
            val IntentRegister =
                Intent (this, MainActivity ::class.java)

            startActivity(IntentRegister)
        }

    }


}

