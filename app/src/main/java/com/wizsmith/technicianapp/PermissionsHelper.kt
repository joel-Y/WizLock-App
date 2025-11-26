package com.wizsmith.technicianapp

import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat

object PermissionsHelper {
    const val REQUEST_BLUETOOTH_PERMISSIONS = 1001

    fun requestPermissions(activity: Activity, permissions: Array<String>) {
        ActivityCompat.requestPermissions(activity, permissions, REQUEST_BLUETOOTH_PERMISSIONS)
    }

    fun checkPermission(activity: Activity, permission: String): Boolean {
        return ActivityCompat.checkSelfPermission(activity, permission) == PackageManager.PERMISSION_GRANTED
    }
}
