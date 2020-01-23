package com.android.bala.mvvmretrofit.utils

import android.util.Log
import javax.inject.Inject

class AppLog @Inject constructor() {

    fun d(message : String) {
        Log.d(AppLog::class.java.name,  "=> $message")
    }
}