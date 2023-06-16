package com.example.saintxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageActivty : AppCompatActivity() {
    lateinit var alaskan:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_activty)

        alaskan=findViewById(R.id.image1)

        alaskan.setOnClickListener{
            var image=Intent(this,BackgroundImage::class.java)
            startActivity(image)
        }
    }
}