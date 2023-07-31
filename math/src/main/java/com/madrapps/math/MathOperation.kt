package com.madrapps.math

interface MathOperation {
    fun add(a: Int, b: Int): Int
    fun subtract(a: Int, b: Int): Int
    fun multiply(a: Int, b: Int): Int
    fun divide(a: Int, b: Int): Int
    fun difference(a: Int, b: Int): Int

    interface MathOp {

    }
}