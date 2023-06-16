package com.example.saintxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ButtonActivity : AppCompatActivity() {
    lateinit var Intent:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        Intent =findViewById(R.id.btn4)

        Intent.setOnClickListener {
            var back= Intent(this,IntentActivity::class.java)
            startActivity(back)
        }
    }
}