package com.example.mycalc

fun main() {
    println("연산할 첫번째 수를 입력하세요.")
    var num1 = readLine()!!.toInt()
    var isFinished = true
    while(isFinished){
        println("연산할 수를 입력하세요. 그만두기-> [0]")
        var num2 = readLine()!!.toInt()
        if(num2 == 0){break}
        println("연산자를 골라주세요")
        println("[1] +  [2] -  [3] *  [4] /  [5]연산 그만하기")
        var operator = readLine()!!.toInt()
        when(operator){
            1 -> {
                val addCalc = Calculator(Addoperation())
                var result = addCalc.operate(num1, num2)
                println("${num1} + ${num2} = ${result}")
                num1 = result.toInt()
                continue
            }
            2 -> {
                val subCalc = Calculator(substractOperation())
                var result = subCalc.operate(num1, num2)
                println("${num1} - ${num2} = ${result}")
                num1 = result.toInt()
                continue
            }
            3 -> {
                val multiCalc = Calculator(MultiplyOperation())
                var result = multiCalc.operate(num1, num2)
                println("${num1} * ${num2} = ${result}")
                num1 = result.toInt()
                continue
            }
            4 -> {
                val divCalc = Calculator(DivideOperation())
                var result = divCalc.operate(num1, num2)
                println("${num1} / ${num2} = ${result}")
                num1 = result.toInt()
                continue
            }
            5 -> {
                isFinished = false
            }
            else -> {
                println("올바른 연산을 골라주세요.")
            }
        }

    }
}