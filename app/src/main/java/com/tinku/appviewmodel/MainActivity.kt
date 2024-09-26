package com.tinku.appviewmodel

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var myViewModel: MyViewModel
    private lateinit var txt: TextView
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        txt = findViewById(R.id.txtCount)
        btn = findViewById(R.id.btnIncrement)

        myViewModel = ViewModelProvider(this)[MyViewModel::class.java]

        /*  fun setText() {
              binding.txtCount.text = mainViewModel.count.toString()
          }*/
        myViewModel.count.observe(this) { count ->
            txt.text = count.toString()
        }

        btn.setOnClickListener {
            myViewModel.increment()
        }
    }

    fun Increments(view: View) {
        myViewModel.decrement()
    }


}
