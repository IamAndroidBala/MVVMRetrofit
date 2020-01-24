package com.android.bala.mvvmretrofit.ui.albumscreen

import com.android.bala.mvvmretrofit.model.album.Album
import com.android.bala.mvvmretrofit.network.GetAlbums
import com.android.myretrofit.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class AlbumPresenter @Inject constructor(private val albums : GetAlbums) : AlbumPresenterImpl {

    private lateinit var albumView : AlbumView

    override fun setLoading() {

        albumView.displayLoading()

        albums.getData().create(ApiInterface::class.java).getAlbums().enqueue(object : Callback<List<Album>> {

            override fun onResponse(call: Call<List<Album>>, response: Response<List<Album>>) {
                albumView.displayResult(response.body()!!)
            }

            override fun onFailure(call: Call<List<Album>>, t: Throwable) {
                albumView.displayError(t.localizedMessage)
            }

        })

    }

    override fun setPage(alBumView: AlbumView) {
        this.albumView = alBumView
    }

}