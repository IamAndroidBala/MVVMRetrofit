package com.android.bala.mvvmretrofit.network

import com.android.myretrofit.network.ApiInterface
import com.android.myretrofit.network.RetrofitClient

class GetUsers (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getUser()

}