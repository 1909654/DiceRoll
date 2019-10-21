package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener{ countUp() }
    }

    private fun rollDice()
    {
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1

        val resultText1: TextView = findViewById(R.id.result_text1)
        resultText1.text = randomInt1.toString()

        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText2.text = randomInt2.toString()

        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText3.text = randomInt3.toString()
    }

    private fun countUp()
    {
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        val total: Int = resultText1.text.toString().toInt() + resultText2.text.toString().toInt() + resultText3.text.toString().toInt()

        val resultText4: TextView = findViewById(R.id.result_text4)
        resultText4.text = total.toString()
    }
}
