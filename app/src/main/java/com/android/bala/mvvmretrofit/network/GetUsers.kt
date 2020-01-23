package com.android.bala.mvvmretrofit.network

class GetUsers (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getUser()

}