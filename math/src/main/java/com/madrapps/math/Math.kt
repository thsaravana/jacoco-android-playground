package com.madrapps.math

class Arithmetic : MathOperation {

    fun moduloOperation(a: Int, b: Int): Int {
        return a % b
    }

    override fun add(a: Int, b: Int): Int {
        return a + b
    }

    override fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    override fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    override fun divide(a: Int, b: Int): Int {
        return a / b
    }

    fun area(a: Int, b: Int): Int {
        return a * b
    }
}