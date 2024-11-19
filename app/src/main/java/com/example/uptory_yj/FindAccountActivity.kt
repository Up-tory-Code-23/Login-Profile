package com.example.uptory_yj

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FindAccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.find_account)

        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        val goToRegisterLink: Button = findViewById(R.id.goToRegisterLink)
        goToRegisterLink.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        val resetPasswordButton: Button = findViewById(R.id.resetPasswordButton)
        resetPasswordButton.setOnClickListener {
            val intent = Intent(this, ChangePasswordActivity::class.java)
            startActivity(intent)
        }
    }
}
