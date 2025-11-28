package com.wizsmith.technicianapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wizsmith.technicianapp.databinding.ActivityServiceTicketsBinding

class ServiceTicketsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityServiceTicketsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServiceTicketsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
