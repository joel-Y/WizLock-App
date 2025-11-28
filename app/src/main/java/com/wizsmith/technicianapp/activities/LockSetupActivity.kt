package com.wizsmith.technicianapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wizsmith.technicianapp.databinding.ActivityLockSetupBinding

class LockSetupActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLockSetupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLockSetupBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
