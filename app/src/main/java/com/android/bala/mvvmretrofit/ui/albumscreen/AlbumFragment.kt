package com.android.bala.mvvmretrofit.ui.albumscreen

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.bala.mvvmretrofit.R
import com.android.bala.mvvmretrofit.application.SocialApplication
import com.android.bala.mvvmretrofit.model.album.Album
import com.android.bala.mvvmretrofit.utils.errorDialog
import javax.inject.Inject

class AlbumFragment : Fragment(), AlbumView {

    private var isVirgin = true
    private var mContext : Context? = null
    lateinit var recyclerAlbum : RecyclerView
    lateinit var progressBar   : ProgressBar
    private var postList = ArrayList<Album>()
    private lateinit var albumAdapter   : AlbumAdapter
    @Inject lateinit var albumPresenter : AlbumPresenterImpl

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val albumView = inflater.inflate(R.layout.fragment_album, container,false)

        (activity?.application as SocialApplication).postComponent.inject(this)

        initView(albumView)

        recyclerAlbum.setHasFixedSize(true)
        recyclerAlbum.layoutManager = LinearLayoutManager(activity)
        val itemDecorator = DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL)
        itemDecorator.setDrawable(ContextCompat.getDrawable(mContext!!,R.drawable.divider)!!)
        recyclerAlbum.addItemDecoration(itemDecorator)

        albumAdapter = AlbumAdapter(postList,activity!!)
        recyclerAlbum.adapter = albumAdapter

        return albumView

    }

    override fun onResume() {
        super.onResume()

        if(isVirgin) {
            isVirgin = false
            albumPresenter.setPage(this)
            albumPresenter.setLoading()
        }

    }

    private fun initView(view : View){
        progressBar   = view.findViewById(R.id.progressbarAlbum)
        recyclerAlbum = view.findViewById(R.id.recyclerAlbum)
    }

    override fun displayLoading() {
        progressBar.post {
            progressBar.visibility = View.VISIBLE
            recyclerAlbum.visibility = View.GONE
        }
    }

    override fun dismissLoading() {
        progressBar.post {
            progressBar.visibility = View.GONE
            recyclerAlbum.visibility = View.VISIBLE
        }
    }

    override fun displayResult(result : List<Album>) {
        recyclerAlbum.post {
            albumAdapter.addAlbum(result)
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