package com.wizsmith.technicianapp.api.models

data class ServiceTicket(
    val ticketId: String,
    val title: String,
    val description: String,
    val status: String
)
