package com.android.bala.mvvmretrofit.ui.commentscreen

import com.android.bala.mvvmretrofit.model.comment.Comment
import com.android.bala.mvvmretrofit.network.GetComments
import com.android.myretrofit.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class CommentPresenter @Inject constructor(private val comment: GetComments) : CommentPresenterImpl {

    private lateinit var commentView: CommentView

    override fun setPage(commentView: CommentView) {
        this.commentView = commentView
    }

    override fun setLoading() {

        commentView.displayLoading()

        comment.getData().create(ApiInterface::class.java).getComments().enqueue(object : Callback<List<Comment>> {
            override fun onResponse(call: Call<List<Comment>>, response: Response<List<Comment>>) {
                commentView.displayResult(response.body()!!)
            }

            override fun onFailure(call: Call<List<Comment>>, t: Throwable) {
                commentView.displayError(t.localizedMessage)
            }
        })

    }

}