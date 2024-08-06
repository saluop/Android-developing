package com.example.signup

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var usernameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signUpButton: Button
    private lateinit var googleSignUpImageButton: ImageButton
    private lateinit var facebookSignUpImageButton: ImageButton
    private lateinit var xSignUpImageButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNameEditText = findViewById(R.id.first_name)
        lastNameEditText = findViewById(R.id.last_name)
        usernameEditText = findViewById(R.id.username)
        emailEditText = findViewById(R.id.email)

        passwordEditText = findViewById(R.id.password_toggle)
        signUpButton = findViewById(R.id.signup_button)
        googleSignUpImageButton = findViewById(R.id.google_signup)
        facebookSignUpImageButton = findViewById(R.id.facebook_signup)
        xSignUpImageButton = findViewById(R.id.x_signup)

        signUpButton.setOnClickListener {
            val firstName = firstNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()
            val username = usernameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (password.length < 8){
                Toast.makeText(this, "Password should be 8 or more character", Toast.LENGTH_SHORT).show()
            }

            // Call API or perform sign up logic here
            Toast.makeText(this, "Sign up successful", Toast.LENGTH_SHORT).show()
        }

        googleSignUpImageButton.setOnClickListener {
            // Call Google sign up API or perform Google sign up logic here
            Toast.makeText(this, "Google sign up successful", Toast.LENGTH_SHORT).show()
        }

        facebookSignUpImageButton.setOnClickListener {
            // Call Facebook sign up API or perform Facebook sign up logic here
            Toast.makeText(this, "Facebook sign up successful", Toast.LENGTH_SHORT).show()
        }

        xSignUpImageButton.setOnClickListener {
            // Call X sign up API or perform X sign up logic here
            Toast.makeText(this, "X sign up successful", Toast.LENGTH_SHORT).show()
        }


    }
}