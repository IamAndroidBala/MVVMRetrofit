package com.android.bala.mvvmretrofit.network

class GetAlbums (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getAlbums()

}