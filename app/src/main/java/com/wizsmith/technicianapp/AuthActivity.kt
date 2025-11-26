package com.wizsmith.technicianapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wizsmith.technicianapp.databinding.ActivityLoginBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()
            // TODO: Validate credentials with backend
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
