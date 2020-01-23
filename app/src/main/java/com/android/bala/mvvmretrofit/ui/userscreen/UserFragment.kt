package com.android.bala.mvvmretrofit.ui.userscreen

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
import com.android.bala.mvvmretrofit.model.user.User
import com.android.bala.mvvmretrofit.utils.errorDialog
import javax.inject.Inject

class UserFragment : Fragment() , UserView{

    private var isVirgin       = true
    private var mContext       : Context? = null
    private var thisList       = ArrayList<User>()
    lateinit var recyclerUser  : RecyclerView
    lateinit var progressBar   : ProgressBar
    private lateinit var userAdapter        : UserAdapter
    @Inject lateinit var userPresenterImpl  : UserPresenterImpl

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val userView  = inflater.inflate(R.layout.fragment_user, container, false)

        (activity?.application as SocialApplication).postComponent.inject(this)

        initView(userView)

        recyclerUser.setHasFixedSize(true)

        userAdapter = UserAdapter(thisList,activity!!)
        recyclerUser.adapter = userAdapter

        return userView
    }

    private fun initView(view : View) {
        recyclerUser = view.findViewById(R.id.recyclerUser)
        progressBar  = view.findViewById(R.id.progressUser)
    }

    override fun onResume() {
        super.onResume()

        if(isVirgin) {
            isVirgin = false
            userPresenterImpl.setPage(this)
            userPresenterImpl.setLoading()
        }

    }

    override fun displayLoading() {
        progressBar.post {
            progressBar.visibility = View.VISIBLE
            recyclerUser.visibility = View.GONE
        }
    }

    override fun dismissLoading() {
        progressBar.post {
            progressBar.visibility = View.GONE
            recyclerUser.visibility = View.VISIBLE
        }
    }

    override fun displayResult(result : List<User>) {
        recyclerUser.post {
            userAdapter.addUser(result)
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
