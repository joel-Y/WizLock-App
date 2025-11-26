package com.wizsmith.technicianapp

import android.content.Context
import android.widget.Toast
import com.ttlock.bl.sdk.api.TTLockClient

object TTLockHelper {

    fun startScan(context: Context) {
        Toast.makeText(context, "Starting TTLock scan...", Toast.LENGTH_SHORT).show()
        // TODO: Integrate TTLock SDK scan logic
    }

    fun provisionLock(context: Context, lockId: String) {
        Toast.makeText(context, "Provisioning lock: $lockId", Toast.LENGTH_SHORT).show()
    }

    fun unlock(context: Context, lockId: String) {
        Toast.makeText(context, "Unlocking: $lockId", Toast.LENGTH_SHORT).show()
    }
}
