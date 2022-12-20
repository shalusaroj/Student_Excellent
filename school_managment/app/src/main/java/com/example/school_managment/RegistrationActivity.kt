package com.example.school_managment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)
    }
    fun login(view: View) {
        val intent = Intent(this@RegistrationActivity, RegistrationActivity::class.java)
        startActivity(intent)
    }
}