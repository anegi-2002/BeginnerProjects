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
         //   Log.e("hui","iside onlcikc")
            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }
        val edDetails= findViewById<Button>(R.id.eddetails)
        edDetails.setOnClickListener {
            //   Log.e("hui","iside onlcikc")
            intent = Intent(this,educationDetails::class.java)
            startActivity(intent)
        }
    }
}