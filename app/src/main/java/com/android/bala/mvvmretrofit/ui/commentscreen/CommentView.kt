package com.android.bala.mvvmretrofit.ui.commentscreen

import com.android.bala.mvvmretrofit.model.comment.Comment

interface CommentView {

    fun displayLoading()

    fun dismissLoading()

    fun displayResult(result : List<Comment>)

    fun displayError(error : String?)

}