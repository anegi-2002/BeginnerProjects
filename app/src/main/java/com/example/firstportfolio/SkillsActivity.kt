package com.example.firstportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.google.android.material.internal.CheckableGroup

class SkillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)


        val buttonr = findViewById<Button>(R.id.clickme)
        buttonr.setOnClickListener {
            val vskillset = findViewById<RadioGroup>(R.id.vskillset)
            val checkbuttonid = vskillset.checkedRadioButtonId
            val exactButton = findViewById<RadioButton>(checkbuttonid)
            Log.d("exactButton","$exactButton")
            val checkbutton = findViewById<CheckBox>(R.id.check1)
            val checkbutton2 = findViewById<CheckBox>(R.id.check2)
            val checkbutton3 = findViewById<CheckBox>(R.id.check3)
            val buttonr = findViewById<TextView>(R.id.resulttext)
            Log.d("exactButton","${exactButton.isChecked}")
            buttonr.text = exactButton.text.toString() + " "+
                    /*if(checkbutton.isChecked)*/ checkbutton.text.toString() /*else ""*/ +
                            /*if(checkbutton2.isChecked)*/ checkbutton2.text.toString() /*else ""*/+
                                    /*if(checkbutton3.isChecked)*/ checkbutton3.text.toString() /*else ""*/
        }
    }
}