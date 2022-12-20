package com.example.school_managment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class login_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
    }
    fun login(view: View) {
        val intent = Intent(this@login_screen, RegistrationActivity::class.java)
        startActivity(intent)
    }
}