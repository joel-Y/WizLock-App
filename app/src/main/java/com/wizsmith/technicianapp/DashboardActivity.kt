package com.wizsmith.technicianapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wizsmith.technicianapp.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.provisionLockButton.setOnClickListener {
            startActivity(Intent(this, LockProvisioningActivity::class.java))
        }

        binding.adminButton.setOnClickListener {
            startActivity(Intent(this, AdminDashboardActivity::class.java))
        }
    }
}
