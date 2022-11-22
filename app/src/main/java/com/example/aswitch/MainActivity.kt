package com.example.aswitch

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun sortowanie(arr:ArrayList<Int>) {
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
            val sortTable = ArrayList<Int>()

            sort_table.text = ""

            if(bt1.isChecked){
                sortTable.add(tx1.text.toString().toInt())
            }
            if(bt2.isChecked){
                sortTable.add(tx2.text.toString().toInt())
            }
            if(bt3.isChecked){
                sortTable.add(tx3.text.toString().toInt())
            }
            if(bt4.isChecked){
                sortTable.add(tx4.text.toString().toInt())
            }
            if(bt5.isChecked){
                sortTable.add(tx5.text.toString().toInt())
            }
            if(bt6.isChecked){
                sortTable.add(tx6.text.toString().toInt())
            }
            if(bt7.isChecked){
                sortTable.add(tx7.text.toString().toInt())
            }
            if(bt8.isChecked){
                sortTable.add(tx8.text.toString().toInt())
            }
            if(bt9.isChecked){
                sortTable.add(tx9.text.toString().toInt())
            }

            sortowanie(sortTable)

            for(elem in sortTable)
            {
                sort_table.text = sort_table.text.toString() + elem.toString() + ", "
            }
        }


    }
}
