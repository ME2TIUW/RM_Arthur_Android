package com.example.sms_services

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.sms_services.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var loginButton: Button
    private lateinit var signupBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loginButton = findViewById(R.id.loginButton)
        signupBtn = findViewById(R.id.signupBtn)

        loginButton.setOnClickListener {
            // Show Toast message
            val toast = Toast.makeText(this, "Login", Toast.LENGTH_SHORT)
            toast.show()

            // Redirect to another activity (replace with your actual activity class)
            val intent = Intent(this, RegisterActivity::class.java) // Change RegisterActivity to your actual class name
            startActivity(intent)
        }

        signupBtn.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java) // Change RegisterActivity to your actual class name
            startActivity(intent)
        }
    }
}