package com.wizsmith.technicianapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.wizsmith.technicianapp.adapters.LockAdapter
import com.wizsmith.technicianapp.api.TTLockRepository
import com.wizsmith.technicianapp.databinding.ActivityTechnicianDashboardBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TechnicianDashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTechnicianDashboardBinding
    private val repository = TTLockRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTechnicianDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lockRecyclerView.layoutManager = LinearLayoutManager(this)

        CoroutineScope(Dispatchers.Main).launch {
            val locks = repository.getLocks()?.locks ?: emptyList()
            binding.lockRecyclerView.adapter = LockAdapter(locks)
        }
    }
}
