package com.terresa.ticketingapps.data

data class Seat(
    var id: Int,
    var x: Float? = 0f,
    var y: Float? = 0f,
    var name: String,
    var isBooked: Boolean
)