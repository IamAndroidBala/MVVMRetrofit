package com.android.bala.mvvmretrofit.network

class GetPhotos (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getPhotos()

}