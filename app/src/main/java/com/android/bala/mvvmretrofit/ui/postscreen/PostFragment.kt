package com.android.bala.mvvmretrofit.ui.postscreen

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.android.bala.mvvmretrofit.R
import com.android.bala.mvvmretrofit.application.SocialApplication
import com.android.bala.mvvmretrofit.model.post.Post
import com.android.bala.mvvmretrofit.utils.errorDialog
import javax.inject.Inject

class PostFragment : Fragment() , PostView {

    private var isVirgin = true
    private var postList = ArrayList<Post>()
    private lateinit var postAdapter : PostAdapter
    @Inject lateinit var myActivityPresenter : PostPresenterImpl
    private var mContext: Context? = null

    lateinit var recyclerPost : RecyclerView
    lateinit var progressBar  : ProgressBar

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val postView  = inflater.inflate(R.layout.fragment_post, container, false)

        (activity?.application as SocialApplication).postComponent.inject(this)

        initViews(postView)

        recyclerPost.setHasFixedSize(true)

        postAdapter = PostAdapter(postList, activity!!)
        recyclerPost.adapter = postAdapter

        return postView
    }

    private fun initViews(view : View) {

        progressBar = view.findViewById(R.id.wait_progress_bar)
        recyclerPost = view.findViewById(R.id.recyclerPost)

    }

    override fun onResume() {
        super.onResume()

        if(isVirgin) {
            isVirgin = true
            myActivityPresenter.setPage(this)
            myActivityPresenter.setLoading()
        }

    }

    override fun displayLoading() {
        this.progressBar.post {
            this.progressBar.visibility = View.VISIBLE
            this.recyclerPost.visibility = View.GONE
        }
    }

    override fun dismissLoading() {
        this.progressBar.post {
            this.progressBar.visibility = View.GONE
            this.recyclerPost.visibility = View.VISIBLE
        }
    }

    override fun displayResult(result : List<Post>) {
        this.recyclerPost.post {
            postAdapter.addPost(result)
        }
    }

    override fun displayError(error : String?) {
        activity?.runOnUiThread {
            R.string.error.errorDialog(activity!!)
        }
    }

    override fun onDetach() {
        super.onDetach()
        mContext = null
    }

}