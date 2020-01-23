package com.android.bala.mvvmretrofit.ui.postscreen

import com.android.bala.mvvmretrofit.model.post.Post

interface PostView {

    fun displayLoading()

    fun dismissLoading()

    fun displayResult(result : List<Post>)

    fun displayError(error : String?)

}