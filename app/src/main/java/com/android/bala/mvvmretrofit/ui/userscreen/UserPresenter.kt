package com.android.bala.mvvmretrofit.ui.userscreen

import com.android.bala.mvvmretrofit.model.user.User
import com.android.bala.mvvmretrofit.model.user.UserResult
import com.android.bala.mvvmretrofit.network.GetUsers
import com.android.myretrofit.network.ApiInterface
import com.android.myretrofit.network.RetrofitClient
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject

class UserPresenter @Inject constructor(private val getUsers: GetUsers) : UserPresenterImpl {

    private lateinit var userView: UserView

    override fun setLoading() {

        userView.dismissLoading()

        getUsers.getData().create(ApiInterface::class.java).getUsers().enqueue(object : retrofit2.Callback<List<User>> {

            override fun onResponse(call: retrofit2.Call<List<User>>, response: retrofit2.Response<List<User>>) {
                userView.dismissLoading()
                response.body()?.let {
                    userView.displayResult(response.body()!!)
                }
            }

            override fun onFailure(call: retrofit2.Call<List<User>>, t: Throwable) {
                userView.displayError(t.localizedMessage)
            }
        })

    }

    override fun setPage(userView: UserView) {
        this.userView = userView
    }

}