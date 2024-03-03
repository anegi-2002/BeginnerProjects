package com.example.firstportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class calculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val btnplus = findViewById<Button>(R.id.btnplus)
        val btnminus = findViewById<Button>(R.id.btnminus)
        val btndivide = findViewById<Button>(R.id.btndivide)
        val btnmultiply = findViewById<Button>(R.id.btnmultiply)

        val edittext1 = findViewById<TextInputEditText>(R.id.edittext1)
        val edittext2 = findViewById<TextInputEditText>(R.id.edittext2)

        val textview12 = findViewById<TextView>(R.id.textView12)

        btnplus.setOnClickListener {
            val input = edittext1.text.toString().toInt()
            val input2 = edittext2.text.toString().toInt()

            textview12.text = (input + input2).toString()
        }

        btnminus.setOnClickListener {
            val input = edittext1.text.toString().toInt()
            val input2 = edittext2.text.toString().toInt()

            textview12.text = (input - input2).toString()
        }

        btnmultiply.setOnClickListener {
            val input = edittext1.text.toString().toInt()
            val input2 = edittext2.text.toString().toInt()

            textview12.text = (input * input2).toString()
        }


        btndivide.setOnClickListener {
            val input = edittext1.text.toString().toFloat()
            val input2 = edittext2.text.toString().toFloat()

            textview12.text = (input / input2).toString()
        }
    }
}