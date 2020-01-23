package com.android.bala.mvvmretrofit.network

class GetComments (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getComments()

}