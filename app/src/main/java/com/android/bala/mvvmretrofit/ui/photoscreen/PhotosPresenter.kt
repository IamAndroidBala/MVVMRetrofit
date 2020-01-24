package com.android.bala.mvvmretrofit.ui.photoscreen

import com.android.bala.mvvmretrofit.model.photos.Photos
import com.android.bala.mvvmretrofit.model.photos.PhotosResult
import com.android.bala.mvvmretrofit.network.GetPhotos
import com.android.myretrofit.network.ApiInterface
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject

class PhotosPresenter @Inject constructor(private val albums : GetPhotos) : PhotosPresenterImpl {

    private lateinit var photoView: PhotoView

    override fun setLoading() {

        photoView.displayLoading()

        albums.getData().create(ApiInterface::class.java).getPhotos().enqueue(object : retrofit2.Callback<List<Photos>> {
            override fun onResponse(call: retrofit2.Call<List<Photos>>, response: retrofit2.Response<List<Photos>>) {
                photoView.displayResult(response.body()!!)
            }

            override fun onFailure(call: retrofit2.Call<List<Photos>>, t: Throwable) {
                photoView.displayError(t.localizedMessage)
            }
        })
    }

    override fun setPage(photoView: PhotoView) {
        this.photoView = photoView
    }

}