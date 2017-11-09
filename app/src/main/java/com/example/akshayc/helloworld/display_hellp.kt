package com.example.akshayc.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display_hellp.*

class display_hellp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_hellp)

        val intent = getIntent() // Get the message from the intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        textView.setText(message)

    }
}
