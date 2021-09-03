package com.madrapps.playground

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun validate(userId: String): Boolean {
        return userId == "admin"
    }

    fun verifyAccess(userId: String): Boolean {
        return userId == "supervisor"
    }
}
