package com.example.uptory_yj

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val registerNowButton: Button = findViewById(R.id.registerNow)
        registerNowButton.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        val forgotPasswordButton: Button = findViewById(R.id.forgotPassword)
        forgotPasswordButton.setOnClickListener{
            val intent = Intent(this, FindAccountActivity::class.java)
            startActivity(intent)
        }

        val loginButtonButton: Button = findViewById(R.id.loginButton)
        loginButtonButton.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}