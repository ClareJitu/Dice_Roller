package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            rollDie()
        }
    }

       fun rollDie()
        {
            val diceOne = Dice()
            val diceTwo = Dice()
            val diceThree = Dice()

            val dice1 : ImageView = findViewById(R.id.dice1)
            val dice2: ImageView = findViewById(R.id.dice2)
            val dice3: ImageView = findViewById(R.id.dice3)

            var firstDiceThrow = diceOne.Roll()
            var secondDiceThrow = diceTwo.Roll()
            var thirdDiceThrow = diceThree.Roll()
            var totalSumOfDice1AndDice2 = firstDiceThrow + secondDiceThrow
            var totalSumOfDice1AndDice3 = firstDiceThrow + thirdDiceThrow
            var totalSumOfDice2AndDice3 = secondDiceThrow + thirdDiceThrow
            var totalSumOfAllDie = firstDiceThrow + secondDiceThrow + thirdDiceThrow


            when(firstDiceThrow){
                1 -> dice1.setImageResource(R.drawable.side_1)
                2 -> dice1.setImageResource(R.drawable.die_2)
                3 -> dice1.setImageResource(R.drawable.die_3)
                4 -> dice1.setImageResource(R.drawable.side_4)
                5 -> dice1.setImageResource(R.drawable.die_5)
                6 -> dice1.setImageResource(R.drawable.side_6)
            }

            when(secondDiceThrow){
                1 -> dice2.setImageResource(R.drawable.side_1)
                2 -> dice2.setImageResource(R.drawable.die_2)
                3 -> dice2.setImageResource(R.drawable.die_3)
                4 -> dice2.setImageResource(R.drawable.side_4)
                5 -> dice2.setImageResource(R.drawable.die_5)
                6 -> dice2.setImageResource(R.drawable.side_6)
            }

            when(thirdDiceThrow){
                1 -> dice3.setImageResource(R.drawable.side_1)
                2 -> dice3.setImageResource(R.drawable.die_2)
                3 -> dice3.setImageResource(R.drawable.die_3)
                4 -> dice3.setImageResource(R.drawable.side_4)
                5 -> dice3.setImageResource(R.drawable.die_5)
                6 -> dice3.setImageResource(R.drawable.side_6)
            }
            if (firstDiceThrow ==6 && secondDiceThrow ==6 && thirdDiceThrow ==6 ){
                val toast = Toast.makeText(this, "You Win", Toast.LENGTH_SHORT)
                toast.show()
            } else if((firstDiceThrow==6 && secondDiceThrow==6)||(firstDiceThrow==6 && thirdDiceThrow==6)|| (secondDiceThrow ==6 && thirdDiceThrow ==6)){
                val toast = Toast.makeText(this, "You Win", Toast.LENGTH_SHORT)
                toast.show()
            } else if(totalSumOfAllDie == 9 || totalSumOfDice1AndDice2 ==9 || totalSumOfDice1AndDice3 ==9 || totalSumOfDice2AndDice3 ==9){

                val toast = Toast.makeText(this, "You Loose", Toast.LENGTH_SHORT)
                toast.show()
            }
}
}
class Dice{
    val sides = 6
    fun Roll():Int {
        var randomNumber = (1..sides).random()
        return randomNumber
    }
}
