package com.android.bala.mvvmretrofit.network

class GetPosts (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getPosts()

}