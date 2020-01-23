package com.android.bala.mvvmretrofit.ui.postscreen

import com.android.bala.mvvmretrofit.model.post.PostResult
import com.android.bala.mvvmretrofit.network.GetPosts
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject

class PostPresenter @Inject constructor(private val post: GetPosts) : PostPresenterImpl {

    private lateinit var postView: PostView

    override fun setPage(myActivityView: PostView) {
        this.postView = myActivityView
    }

    override fun setLoading() {

        postView.displayLoading()

        post.getData().enqueue(object : Callback {

            override fun onResponse(call: Call, response: Response) {

                postView.dismissLoading()

                if (response.isSuccessful) {
                    response.let {
                        PostResult(it).allResult?.let {
                            postView.displayResult(it)
                        } ?: run {
                            postView.displayError(response.message())
                        }
                    }
                } else {
                    postView.displayError(response.message())
                }

            }

            override fun onFailure(call: Call, e: IOException) {
                postView.displayError(e.message)
            }

        })

    }


}