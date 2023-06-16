package com.example.saintxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Declare variable
    lateinit var toast:Button
    lateinit var info:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Finding my ID
        toast=findViewById(R.id.button2)
        info=findViewById(R.id.button3)

        //setOnclickListener
        toast.setOnClickListener {
            Toast.makeText(applicationContext, "You did it successfully",Toast.LENGTH_LONG).show()


        info.setOnClickListener{
            Toast.makeText(applicationContext,"Welcome to employee form",Toast.LENGTH_LONG).show()
            var myinfo= Intent(this,FormActivity::class.java)
            startActivity(myinfo)
        }

        }
    }
}