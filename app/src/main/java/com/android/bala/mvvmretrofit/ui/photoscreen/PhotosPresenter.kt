package com.android.bala.mvvmretrofit.ui.photoscreen

import com.android.bala.mvvmretrofit.model.photos.PhotosResult
import com.android.bala.mvvmretrofit.network.GetPhotos
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject

class PhotosPresenter @Inject constructor(private val albums : GetPhotos) : PhotosPresenterImpl {

    private lateinit var photoView: PhotoView

    override fun setLoading() {

        photoView.displayLoading()

        albums.getData().enqueue(object : Callback {

            override fun onResponse(call: Call, response: Response) {

                photoView.dismissLoading()

                if (response.isSuccessful) {
                    response.let {
                        PhotosResult(it).allPhotos?.let {
                            photoView.displayResult(it)
                        } ?: run {
                            photoView.displayError(response.message())
                        }
                    }
                } else {
                    photoView.displayError(response.message())
                }

            }

            override fun onFailure(call: Call, e: IOException) {
                photoView.displayError(e.message)
            }

        })

    }

    override fun setPage(photoView: PhotoView) {
        this.photoView = photoView
    }

}