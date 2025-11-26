package com.wizsmith.technicianapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wizsmith.technicianapp.databinding.ActivityAdminDashboardBinding

class AdminDashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: Admin features: Device mapping, Odoo integration, incident logs
    }
}
