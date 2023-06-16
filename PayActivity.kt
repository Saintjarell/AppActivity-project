package com.example.saintxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PayActivity : AppCompatActivity() {
    lateinit var stk: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        stk=findViewById(R.id.BtnStk)

        stk.setOnClickListener {
            var simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it)}
        }
    }
}