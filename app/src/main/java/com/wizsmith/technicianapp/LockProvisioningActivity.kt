package com.wizsmith.technicianapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wizsmith.technicianapp.databinding.ActivityLockProvisioningBinding

class LockProvisioningActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLockProvisioningBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLockProvisioningBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.scanLockButton.setOnClickListener {
            TTLockHelper.startScan(this)
        }
    }
}
