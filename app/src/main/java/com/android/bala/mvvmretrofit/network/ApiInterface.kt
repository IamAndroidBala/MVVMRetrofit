package com.android.myretrofit.network


import com.android.bala.mvvmretrofit.model.album.Album
import com.android.bala.mvvmretrofit.model.comment.Comment
import com.android.bala.mvvmretrofit.model.photos.Photos
import com.android.bala.mvvmretrofit.model.post.Post
import com.android.bala.mvvmretrofit.model.user.User
import com.android.bala.mvvmretrofit.utils.*
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET(PHOTOS_URL)
    fun getPhotos()     :  Call<List<Photos>>

    @GET(ALBUM_URL)
    fun getAlbums()     :  Call<List<Album>>

    @GET(USER_URL)
    fun getUsers()      :  Call<List<User>>

    @GET(POST_URL)
    fun getPost()       :  Call<List<Post>>

    @GET(COMMENT_URL)
    fun getComments()   :  Call<List<Comment>>

}