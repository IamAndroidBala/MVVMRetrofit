package com.android.bala.mvvmretrofit.ui.postscreen

import com.android.bala.mvvmretrofit.model.post.Post
import com.android.bala.mvvmretrofit.network.GetPosts
import com.android.bala.mvvmretrofit.utils.AppLog
import com.android.myretrofit.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class PostPresenter @Inject constructor(private val post: GetPosts) : PostPresenterImpl {

    private lateinit var postView: PostView

    override fun setPage(myActivityView: PostView) {
        this.postView = myActivityView
    }

    override fun setLoading() {

        postView.displayLoading()

        post.getData().create(ApiInterface::class.java).getPost().enqueue(object : Callback<List<Post>>{
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                postView.displayResult(response.body()!!)
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                postView.displayError(t.localizedMessage)
            }
        })
    }

}