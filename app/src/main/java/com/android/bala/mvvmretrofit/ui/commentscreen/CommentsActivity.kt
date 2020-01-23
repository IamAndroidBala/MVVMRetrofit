package com.android.bala.mvvmretrofit.ui.commentscreen

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.bala.mvvmretrofit.R
import com.android.bala.mvvmretrofit.application.SocialApplication
import com.android.bala.mvvmretrofit.model.comment.Comment
import com.android.bala.mvvmretrofit.model.post.Post
import com.android.bala.mvvmretrofit.utils.errorDialog
import kotlinx.android.synthetic.main.activity_comments.*
import javax.inject.Inject

class CommentsActivity : AppCompatActivity() , CommentView {

    lateinit var commentAdapter: CommentAdapter
    var thisList = ArrayList<Comment>()
    @Inject lateinit var commentPresenter: CommentPresenterImpl
    lateinit var mPost: Post

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_comments)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = resources.getString(R.string.comment)

        (application as SocialApplication).postComponent.inject(this)

        recyclerComment.setHasFixedSize(true)
        recyclerComment.layoutManager = LinearLayoutManager(applicationContext)
        recyclerComment.isNestedScrollingEnabled = false

        commentAdapter = CommentAdapter(thisList,this@CommentsActivity)
        recyclerComment.adapter = commentAdapter

        commentPresenter.setPage(this)
        commentPresenter.setLoading()

        if(intent?.extras?.getParcelable<Post>("Post") != null) {
            mPost = intent?.extras?.getParcelable<Post>("Post") as Post
            tvCommentHeading.text = mPost.title
            tvCommentDes.text = mPost.body
        }

    }

    override fun displayLoading() {
        progressbarComment.post {
            progressbarComment.visibility = View.VISIBLE
            recyclerComment.visibility = View.GONE
        }
    }

    override fun dismissLoading() {
        progressbarComment.post {
            progressbarComment.visibility = View.GONE
            recyclerComment.visibility = View.VISIBLE
        }
    }

    override fun displayResult(result : List<Comment>) {
        recyclerComment.post {
            val finalResult : List<Comment> = result.filter { comment ->  comment.postId == mPost.id }
            commentAdapter.addComment(finalResult)
        }
    }

    override fun displayError(error : String?) {
        runOnUiThread {
            R.string.error.errorDialog(this@CommentsActivity)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

}