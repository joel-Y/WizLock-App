package com.wizsmith.technicianapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wizsmith.technicianapp.api.models.Lock
import com.wizsmith.technicianapp.databinding.ItemLockBinding

class LockAdapter(private val locks: List<Lock>) :
    RecyclerView.Adapter<LockAdapter.LockViewHolder>() {

    inner class LockViewHolder(val binding: ItemLockBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LockViewHolder {
        val binding = ItemLockBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LockViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LockViewHolder, position: Int) {
        val lock = locks[position]
        holder.binding.lockName.text = lock.lockName
        holder.binding.lockStatus.text = lock.status
    }

    override fun getItemCount(): Int = locks.size
}
