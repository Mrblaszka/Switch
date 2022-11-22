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
        fun sortowanie(arr:IntArray):IntArray{
            var swap = true
            while(swap){
                swap = false
                for(i in 0 until arr.size-1){
                    if(arr[i] > arr[i+1]){
                        val temp = arr[i]
                        arr[i] = arr[i+1]
                        arr[i + 1] = temp

                        swap = true
                    }
                }
            }
            return arr
        }

        //Liczby
        var tx1 = findViewById<TextView>(R.id.nb0)
        var tx2 = findViewById<TextView>(R.id.nb1)
        var tx3 = findViewById<TextView>(R.id.nb2)
        var tx4 = findViewById<TextView>(R.id.nb3)
        var tx5 = findViewById<TextView>(R.id.nb4)
        var tx6 = findViewById<TextView>(R.id.nb5)
        var tx7 = findViewById<TextView>(R.id.nb6)
        var tx8 = findViewById<TextView>(R.id.nb7)
        var tx9 = findViewById<TextView>(R.id.nb8)

        //Przyciski
        val bt1 = findViewById<Switch>(R.id.sw1)
        val bt2 = findViewById<ToggleButton>(R.id.tg1)
        val bt3 = findViewById<ToggleButton>(R.id.tg2)
        val bt4 = findViewById<ToggleButton>(R.id.tg3)
        val bt5 = findViewById<Switch>(R.id.sw4)
        val bt6 = findViewById<ToggleButton>(R.id.tg5)
        val bt7 = findViewById<ToggleButton>(R.id.tg6)
        val bt8 = findViewById<ToggleButton>(R.id.tg7)
        val bt9 = findViewById<ToggleButton>(R.id.tg8)

        //Domyślne ustawienie

        //Funkcje
        val sort = findViewById<Button>(R.id.sort)
        val random = findViewById<Button>(R.id.random)
        val sort_table = findViewById<TextView>(R.id.textarea)

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


            if(bt1.isSaveEnabled){
                sort_table.append(tx1.text)
                sort_table.append(",")
            }
            if(bt2.text=="ON"){
                sort_table.append(tx2.text)
                sort_table.append(",")
            }
            if(bt2.text=="ON"){
                sort_table.append(tx3.text)
                sort_table.append(",")
            }
            if(bt4.text=="ON"){
                sort_table.append(tx4.text)
                sort_table.append(",")
            }
            if(bt5.isSaveEnabled){
                sort_table.append(tx5.text)
                sort_table.append(",")
            }
            if(bt6.text=="ON"){
                sort_table.append(tx6.text)
                sort_table.append(",")
            }
            if(bt7.text=="ON"){
                sort_table.append(tx7.text)
                sort_table.append(",")
            }
            if(bt8.text=="ON"){
                sort_table.append(tx8.text)
                sort_table.append(",")
            }
            if(bt9.text=="ON"){
                sort_table.append(tx9.text)
                sort_table.append(",")
            }

        }

        //Sortowanie
        sort.setOnClickListener {
            val lista = sortowanie(intArrayOf(sort_table.text.toString().toInt()))
            sort_table.text = lista.toString()
        }

    }
}