package com.example.saintxml

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class IntentActivity : AppCompatActivity() {
    //Declaring variables
    lateinit var sms:Button
    lateinit var email:Button
    lateinit var share:Button
    lateinit var camera:Button
    lateinit var stk:Button
    lateinit var call:Button
    lateinit var jersey:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        //Finding view by id
        sms=findViewById(R.id.BtnSms)
        email=findViewById(R.id.BtnEmail)
        share=findViewById(R.id.BtnShare)
        stk=findViewById(R.id.BtnStk)
        call=findViewById(R.id.BtnCall)
        camera=findViewById(R.id.BtnCamera)
        jersey=findViewById(R.id.bTn1)

        //Intent

        //sms
        sms.setOnClickListener {
            var uri = Uri.parse("smsto:0731052023")
            var intent= Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("sms_body", "Rada Morio...")
            startActivity(intent)
        }

        //Email
        email.setOnClickListener {
            var emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "jarell@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear mama....")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }

        //Share
        share.setOnClickListener {
            var shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "https://www.google.com/search?client=firefox-b-lm&q=images")
            startActivity(shareIntent)
        }

        //stk
        stk.setOnClickListener {
            var simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it)}
        }


        //call
        call.setOnClickListener {
            var dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0731052023")
            startActivity(dialIntent)
        }

        //camera
        camera.setOnClickListener {
            var takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)
        }


    }
}