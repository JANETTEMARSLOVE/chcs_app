package com.example.chcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val forgotPasswordBtn: Button = findViewById(R.id.forgotPassword)

        forgotPasswordBtn.setOnClickListener{
            val intent= Intent(this, ForgotPasswordActivity::class.java)

            startActivity(intent)
        }

        val createNewBtn: Button = findViewById(R.id.createNewAcct)

        createNewBtn.setOnClickListener {
            val i = Intent(this, CreateNewAccountActivity::class.java)

            startActivity(i)
        }
    }
}