package com.wizsmith.technicianapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wizsmith.technicianapp.databinding.ActivityGatewaySetupBinding

class GatewaySetupActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGatewaySetupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGatewaySetupBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
