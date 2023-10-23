package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profile : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val btn_bck = findViewById<Button>(R.id.bck)

        btn_bck.setOnClickListener {
            val IntentRegister =
                Intent(this, home::class.java)

            startActivity(IntentRegister)

        }
    }
}
