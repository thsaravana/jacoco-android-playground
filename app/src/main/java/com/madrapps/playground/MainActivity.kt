package com.madrapps.playground

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userId = "admin"
        val model: MainViewModel by viewModels()
        Log.d("Access", "Validate = ${model.validate(userId)}")
        Log.d("Access", "Verify Access = ${model.verifyAccess(userId)}")
    }
}
