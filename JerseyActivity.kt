package com.example.saintxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class JerseyActivity : AppCompatActivity() {
    lateinit var city:ImageView
    lateinit var messi:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jersey)

        city=findViewById(R.id.image4)
        messi=findViewById(R.id.image5)

        city.setOnClickListener {
            var buy = Intent(this, PayActivity::class.java)
            startActivity(buy)
        }

        messi.setOnClickListener{
            var nunua= Intent(this,PayActivity::class.java)
            startActivity(nunua)
        }
    }
}