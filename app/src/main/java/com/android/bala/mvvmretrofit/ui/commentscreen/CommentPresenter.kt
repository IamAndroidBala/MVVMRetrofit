package com.android.bala.mvvmretrofit.ui.commentscreen

import com.android.bala.mvvmretrofit.model.comment.CommentResult
import com.android.bala.mvvmretrofit.network.GetComments
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject

class CommentPresenter @Inject constructor(private val comment: GetComments) : CommentPresenterImpl {

    private lateinit var commentView: CommentView

    override fun setPage(commentView: CommentView) {
        this.commentView = commentView
    }

    override fun setLoading() {

        commentView.displayLoading()

        comment.getData().enqueue(object : Callback {

            override fun onResponse(call: Call, response: Response) {

                commentView.dismissLoading()

                if (response.isSuccessful) {
                    response.let {
                        CommentResult(it).allComment?.let {
                            commentView.displayResult(it)
                        } ?: run {
                            commentView.displayError(response.message())
                        }
                    }
                } else {
                    commentView.displayError(response.message())
                }

            }

            override fun onFailure(call: Call, e: IOException) {
                commentView.displayError(e.message)
            }

        })

    }


}