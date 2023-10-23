package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_pindah = findViewById<Button>(R.id.login)

        btn_pindah.setOnClickListener {
            val IntentPindah =
                Intent (this, login ::class.java)

            startActivity(IntentPindah)
        }

        val btn_register = findViewById<Button>(R.id.register)

        btn_register.setOnClickListener {
            val IntentRegister =
                Intent (this, register ::class.java)

            startActivity(IntentRegister)
        }

    }


}
