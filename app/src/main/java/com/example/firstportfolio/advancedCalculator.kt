package com.example.firstportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class advancedCalculator : AppCompatActivity() {

    private var currentInput = StringBuilder()
    private var firstOperand = 0
    private var secondOperand = 0
    private var operator = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced_calculator)

        val inputText = findViewById<TextView>(R.id.inputtext)
        val resultText = findViewById<TextView>(R.id.resulttext)
        val btnAc = findViewById<Button>(R.id.btnac)
        val btnEqualsTo = findViewById<Button>(R.id.btnequlsto)

        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn0 = findViewById<Button>(R.id.btn0)
        val btnDot = findViewById<Button>(R.id.btndot)

        val btnDiv = findViewById<Button>(R.id.btndiv)
        val btnMulti = findViewById<Button>(R.id.btnmulti)
        val btnMinus = findViewById<Button>(R.id.btnMINUS)
        val btnPlus = findViewById<Button>(R.id.btnPLUS)

        btnAc.setOnClickListener {
            clear()
        }

        btnEqualsTo.setOnClickListener {
            evaluate()
        }

        btn0.setOnClickListener { appendNumber(0) }
        btn1.setOnClickListener { appendNumber(1) }
        btn2.setOnClickListener { appendNumber(2) }
        btn3.setOnClickListener { appendNumber(3) }
        btn4.setOnClickListener { appendNumber(4) }
        btn5.setOnClickListener { appendNumber(5) }
        btn6.setOnClickListener { appendNumber(6) }
        btn7.setOnClickListener { appendNumber(7) }
        btn8.setOnClickListener { appendNumber(8) }
        btn9.setOnClickListener { appendNumber(9) }
        btnDot.setOnClickListener { appendDot() }

        btnDiv.setOnClickListener { setOperator("/") }
        btnMulti.setOnClickListener { setOperator("*") }
        btnMinus.setOnClickListener { setOperator("-") }
        btnPlus.setOnClickListener { setOperator("+") }
    }

    private fun appendNumber(number: Int) {
        currentInput.append(number)
        updateInputText()
    }

    private fun appendDot() {
        if (!currentInput.contains('.')) {
            currentInput.append('.')
            updateInputText()
        }
    }

    private fun setOperator(op: String) {
        if (currentInput.isNotEmpty()) {
            firstOperand = currentInput.toString().toInt()
            currentInput.clear()
            operator = op
        }
    }

    private fun evaluate() {
        if (currentInput.isNotEmpty()) {
            secondOperand = currentInput.toString().toInt()
        }
        val result = when (operator) {
            "+" -> firstOperand + secondOperand
            "-" -> firstOperand - secondOperand
            "*" -> firstOperand * secondOperand
            "/" -> if (secondOperand != 0) firstOperand / secondOperand else 0
            else -> 0
        }
        clear()
        currentInput.append(result)
        updateInputText()
    }

    private fun clear() {
        currentInput.clear()
        firstOperand = 0
        secondOperand = 0
        operator = ""
        updateInputText()
    }

    private fun updateInputText() {
        val inputText = findViewById<TextView>(R.id.resulttext)
       if(currentInput.toString().length!=0)
        inputText.text = currentInput.toString()
        else
           inputText.text= "0"
    }
}