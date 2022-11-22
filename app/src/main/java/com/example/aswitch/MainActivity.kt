package com.example.aswitch

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var tx1 = findViewById<TextView>(R.id.nb0)
        var tx2 = findViewById<TextView>(R.id.nb1)
        var tx3 = findViewById<TextView>(R.id.nb2)
        var tx4 = findViewById<TextView>(R.id.nb3)
        var tx5 = findViewById<TextView>(R.id.nb4)
        var tx6 = findViewById<TextView>(R.id.nb5)
        var tx7 = findViewById<TextView>(R.id.nb6)
        var tx8 = findViewById<TextView>(R.id.nb7)
        var tx9 = findViewById<TextView>(R.id.nb8)

        val sort = findViewById<Button>(R.id.sort)
        val random = findViewById<Button>(R.id.random)
        val sort_table = findViewById<TextView>(R.id.)

        random.setOnClickListener {
            tx1.text = Random.nextInt(0,9).toString()
            tx2.text = Random.nextInt(0,9).toString()
            tx3.text = Random.nextInt(0,9).toString()
            tx4.text = Random.nextInt(0,9).toString()
            tx5.text = Random.nextInt(0,9).toString()
            tx6.text = Random.nextInt(0,9).toString()
            tx7.text = Random.nextInt(0,9).toString()
            tx8.text = Random.nextInt(0,9).toString()
            tx9.text = Random.nextInt(0,9).toString()
        }

        sort.setOnClickListener {
            val bt1 = findViewById<Switch>(R.id.sw1)
            val bt2 = findViewById<ToggleButton>(R.id.tg1)
            val bt3 = findViewById<ToggleButton>(R.id.tg2)
            val bt4 = findViewById<ToggleButton>(R.id.tg3)
            val bt5 = findViewById<Switch>(R.id.sw4)
            val bt6 = findViewById<ToggleButton>(R.id.tg5)
            val bt7 = findViewById<ToggleButton>(R.id.tg6)
            val bt8 = findViewById<ToggleButton>(R.id.tg7)
            val bt9 = findViewById<ToggleButton>(R.id.tg8)

            if(bt1.isActivated){

            }

        }

    }
}