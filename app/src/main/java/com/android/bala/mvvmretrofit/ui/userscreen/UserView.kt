package com.android.bala.mvvmretrofit.ui.userscreen

import com.android.bala.mvvmretrofit.model.user.User

interface UserView {

    fun displayLoading()

    fun dismissLoading()

    fun displayResult(result : List<User>)

    fun displayError(error : String?)

}