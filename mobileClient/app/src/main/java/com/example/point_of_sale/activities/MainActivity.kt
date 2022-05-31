package com.example.point_of_sale.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.example.point_of_sale.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val usernameField = findViewById<TextInputEditText>(R.id.usernameInputText)
        val passwordField = findViewById<TextInputEditText>(R.id.passwordInputText)
        loginButton.setOnClickListener{

            val username = usernameField.text.toString()
            val password = passwordField.text.toString()
            if (TextUtils.isEmpty(username))
                usernameField.setError("Field cannot be empty")
            if (TextUtils.isEmpty(password))
                passwordField.setError("Field cannot be empty")

            if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)) {
                val correctUsername = resources.getString(R.string.hardUsername)
                val correctpwd = resources.getString(R.string.hardpwd)
                Log.e("Login", "${correctUsername.toString()} $username ${correctpwd.toString()} $password")
                //login and check credentials
                if (username == correctUsername && password == correctpwd){
                    Toast.makeText(this, "Logged in", Toast.LENGTH_SHORT)
                    intent = Intent(this, HomeActivity::class.java )
                    startActivity(intent)

                }
                else
                    Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT)

            }
        }
    }

    override fun onStart() {
        super.onStart()
    }
}