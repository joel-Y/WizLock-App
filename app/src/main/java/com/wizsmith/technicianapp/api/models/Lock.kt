package com.wizsmith.technicianapp.api.models

data class Lock(
    val lockId: String,
    val lockName: String,
    val lockMac: String,
    val gatewayId: String,
    val status: String
)
