package com.example.school_managment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity_Teacher  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_teacher)
    }
    fun login(view: View) {
        val intent = Intent(this@RegistrationActivity_Teacher, RegistrationActivity::class.java)
        startActivity(intent)
    }
}