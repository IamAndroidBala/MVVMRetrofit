package com.android.bala.mvvmretrofit.ui.photoscreen

import com.android.bala.mvvmretrofit.model.photos.Photos

interface PhotoView {

    fun displayLoading()

    fun dismissLoading()

    fun displayResult(result : List<Photos>)

    fun displayError(error : String?)

}