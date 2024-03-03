package com.example.firstportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSkills= findViewById<Button>(R.id.btnskills)
        buttonSkills.setOnClickListener {

            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }
        val edDetails= findViewById<Button>(R.id.eddetails)
        edDetails.setOnClickListener {

            intent = Intent(this,educationDetails::class.java)
            startActivity(intent)
        }
        val calculator= findViewById<Button>(R.id.calculator)
        calculator.setOnClickListener {

            intent = Intent(this,calculatorActivity::class.java)
            startActivity(intent)
        }
        val advanced_Calculator= findViewById<Button>(R.id.adavncedcalculator)
        advanced_Calculator.setOnClickListener {

            intent = Intent(this,advancedCalculator::class.java)
            startActivity(intent)
        }
    }
}