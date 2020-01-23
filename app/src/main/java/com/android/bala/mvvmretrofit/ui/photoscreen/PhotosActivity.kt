package com.android.bala.mvvmretrofit.ui.photoscreen

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.bala.mvvmretrofit.R
import com.android.bala.mvvmretrofit.application.SocialApplication
import com.android.bala.mvvmretrofit.model.album.Album
import com.android.bala.mvvmretrofit.model.photos.Photos
import com.android.bala.mvvmretrofit.utils.errorDialog
import kotlinx.android.synthetic.main.activity_photos.*
import javax.inject.Inject

class PhotosActivity : AppCompatActivity(), PhotoView {

    lateinit var mAlbum: Album
    lateinit var photoAdapter: PhotoAdapter
    private var thisList = ArrayList<Photos>()
    @Inject lateinit var photosPresenterImpl: PhotosPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_photos)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = resources.getString(R.string.photos)

        (application as SocialApplication).postComponent.inject(this)

        recyclerPhotos.setHasFixedSize(true)

        photoAdapter = PhotoAdapter(thisList,this@PhotosActivity)
        recyclerPhotos.adapter = photoAdapter

        photosPresenterImpl.setPage(this)
        photosPresenterImpl.setLoading()

        if(intent?.extras?.getParcelable<Album>("Album") != null) {
            mAlbum = intent?.extras?.getParcelable<Album>("Album") as Album
        }

    }

    override fun displayLoading() {
        progressbarPhoto.post {
            progressbarPhoto.visibility = View.VISIBLE
            recyclerPhotos.visibility = View.GONE
        }
    }

    override fun dismissLoading() {
        progressbarPhoto.post {
            progressbarPhoto.visibility = View.GONE
            recyclerPhotos.visibility = View.VISIBLE
        }
    }

    override fun displayResult(result : List<Photos>) {
        recyclerPhotos.post {
            val finalResult : List<Photos> = result.filter { photo ->  photo.albumId == mAlbum.id }
            photoAdapter.addPhotos(finalResult)
        }
    }

    override fun displayError(error : String?) {
        runOnUiThread {
            R.string.error.errorDialog(this@PhotosActivity)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

}