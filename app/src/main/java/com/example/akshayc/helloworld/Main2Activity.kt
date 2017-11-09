package com.example.akshayc.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.example.akshayc.helloworld.R.id.firstList
import android.widget.ListView


val mobileArray = arrayOf("Song 01", "Song 01", "Song 03", "Song 04", "Song 05", "Song 06", "Song 07", "Song 09", "Song 10", "Song 11", "Song 12", "Song ")

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val adapter1 = ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mobileArray)

        val listView = findViewById<ListView>(R.id.firstList) as ListView
        listView.adapter = adapter1

    }
}
