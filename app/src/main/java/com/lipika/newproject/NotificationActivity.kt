package com.lipika.newproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NotificationActivity : AppCompatActivity() {
    lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        val userName=intent.getStringExtra(setData.name)
        textView=findViewById(R.id.textView)

        title ="Notification"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        textView.text="Welcome ${userName}!"

    }
}