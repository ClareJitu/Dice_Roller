package com.example.diceroller



class Inheritance{
    open class Car (var name: String, var color: String){
        fun cost(): Double{
           return 300000.00
        }
    }

       val smooth = Car("Chevrolet", "Grey")
       val cool = Car("4runner", "Black")

       class ChildCar(color: String, name: String): Car(color, name)

}
