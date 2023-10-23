package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout

class about : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val btn_back = findViewById<Button>(R.id.A_back)

        btn_back.setOnClickListener {
            val IntentRegister =
                Intent(this, home::class.java)

            startActivity(IntentRegister)
        }
    }
}