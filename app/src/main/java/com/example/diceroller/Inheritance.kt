package com.example.diceroller



class Dice(
    private val numSides: Int
) {
    fun roll(): Int {
        return (1..numSides).random()

    }
   open class Car (private val name: String = "Toyota", private val color: String = "Red"){
       val smooth = Car("Chevrolet", "Grey").cost()
       val cool = Car("4runner", "Black").cost()

       private fun cost(){
          name
           color
       }
       class ChildCar: Car() {
           private fun myCar(){
               println(smooth)
               println(cool)
           }
           fun main(){
               val myObj = ChildCar()
               myObj.myCar()
           }

       }
    }

}
