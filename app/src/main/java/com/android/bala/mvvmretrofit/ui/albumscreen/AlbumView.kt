package com.android.bala.mvvmretrofit.ui.albumscreen

import com.android.bala.mvvmretrofit.model.album.Album

interface AlbumView {

    fun displayLoading()

    fun dismissLoading()

    fun displayResult(result : List<Album>)

    fun displayError(error : String?)

}