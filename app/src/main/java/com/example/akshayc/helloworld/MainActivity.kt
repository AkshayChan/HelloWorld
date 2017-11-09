package com.example.akshayc.helloworld

import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(toolbar)

        //fab.setOnClickListener {view -> sendMessage(view)}
    }

    companion object {
       const val EXTRA_MESSAGE = "Hello from the other side"
    }

    fun sendMessage(view: View): Unit {
        val intent = Intent(this, display_hellp::class.java)
        val message = editText2.text.toString() // editText defined in content main.xml
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

    fun startActivity(view: View) :Unit {
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }
}
