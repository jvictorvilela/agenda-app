package com.example.agenda.model

class Contact (
    var name: String,
    var email: String,
    var phone: String
) {
    override fun toString(): String {
        return name
    }
}