package com.example.mycalc

class Addoperation : AbstractOperation(){
    override fun operate(num1: Int, num2: Int): Double{
        var result = (num1+num2).toDouble()
        return result
    }
}

