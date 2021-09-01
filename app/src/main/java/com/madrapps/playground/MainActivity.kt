package com.madrapps.playground

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.madrapps.math.Arithmetic

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // App Module
        val userId = "admin"
        val model: MainViewModel by viewModels()
        Log.d("App", "Validate = ${model.validate(userId)}")
        Log.d("App", "Verify Access = ${model.verifyAccess(userId)}")

        // Math module
        val arithmetic = Arithmetic()
        Log.d("Math", "Add = ${arithmetic.add(2, 5)}")
        Log.d("Math", "Multiply = ${arithmetic.multiply(2, 5)}")
    }
}
