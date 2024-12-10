package com.example.sms_services

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class RegisterActivity : AppCompatActivity() {

    private lateinit var signupButton: Button
    private lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register) // Use the correct layout file name

        signupButton = findViewById(R.id.signupButton)
        loginBtn = findViewById(R.id.loginBtn)

        signupButton.setOnClickListener {
            val toast = Toast.makeText(this, "Sign Up", Toast.LENGTH_SHORT)
            toast.show()
        }

        loginBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) // Change to your actual MainActivity class name
            startActivity(intent)
        }
    }
}