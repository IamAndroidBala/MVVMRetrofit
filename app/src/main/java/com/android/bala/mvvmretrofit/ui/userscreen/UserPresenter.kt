package com.android.bala.mvvmretrofit.ui.userscreen

import com.android.bala.mvvmretrofit.model.user.UserResult
import com.android.bala.mvvmretrofit.network.GetUsers
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject

class UserPresenter @Inject constructor(private val getUsers: GetUsers) : UserPresenterImpl {

    private lateinit var userView: UserView

    override fun setLoading() {

        userView.dismissLoading()

        getUsers.getData().enqueue( object : Callback {

            override fun onResponse(call: Call, response: Response) {

                userView.dismissLoading()

                if(response.isSuccessful) {
                    response.let {
                        UserResult(it).allUser?.let {
                            userView.displayResult(it)
                        } ?: run {
                            userView.displayError(response.message())
                        }
                    }
                }else {
                    userView.displayError(response.message())
                }

            }

            override fun onFailure(call: Call, e: IOException) {
                userView.displayError(e.message)
            }

        })

    }

    override fun setPage(userView: UserView) {
        this.userView = userView
    }

}