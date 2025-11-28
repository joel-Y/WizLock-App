package com.wizsmith.technicianapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wizsmith.technicianapp.databinding.ActivityAdminDashboardBinding

class AdminDashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdminDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLockSetup.setOnClickListener {
            startActivity(Intent(this, LockSetupActivity::class.java))
        }

        binding.btnGatewaySetup.setOnClickListener {
            startActivity(Intent(this, GatewaySetupActivity::class.java))
        }

        binding.btnDiagnostics.setOnClickListener {
            startActivity(Intent(this, DiagnosticsActivity::class.java))
        }

        binding.btnServiceTickets.setOnClickListener {
            startActivity(Intent(this, ServiceTicketsActivity::class.java))
        }
    }
}
