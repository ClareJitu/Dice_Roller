package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun rollDice(){
        }
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            rollDice()
        }
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = diceRoll.toString()

        // Roll the dice when the app start
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = when (diceRoll){
            1 -> R.drawable.side_1
            2 -> R.drawable.die_2
            3 -> R.drawable.die_3
            4 -> R.drawable.side_4
            5 -> R.drawable.die_5
            else -> R.drawable.side_6
        }
        if (diceRoll ==6){
            val toast = Toast.makeText(this, "You Win", Toast.LENGTH_SHORT)
            toast.show()
        } else if(diceRoll== 9){
            val toast = Toast.makeText(this, "You Loose", Toast.LENGTH_SHORT)
            toast.show()
        }

        diceImage.setImageResource(drawableResource)


    }
}