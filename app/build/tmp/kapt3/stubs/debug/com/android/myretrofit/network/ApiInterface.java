package com.android.myretrofit.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/android/myretrofit/network/ApiInterface;", "", "getAlbums", "Lretrofit2/Call;", "", "Lcom/android/bala/mvvmretrofit/model/album/Album;", "getComments", "Lcom/android/bala/mvvmretrofit/model/comment/Comment;", "getPhotos", "Lcom/android/bala/mvvmretrofit/model/photos/Photos;", "getPost", "Lcom/android/bala/mvvmretrofit/model/post/Post;", "getUsers", "Lcom/android/bala/mvvmretrofit/model/user/User;", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "https://jsonplaceholder.typicode.com/photos/")
    public abstract retrofit2.Call<java.util.List<com.android.bala.mvvmretrofit.model.photos.Photos>> getPhotos();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "https://jsonplaceholder.typicode.com/albums/")
    public abstract retrofit2.Call<java.util.List<com.android.bala.mvvmretrofit.model.album.Album>> getAlbums();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "https://jsonplaceholder.typicode.com/users/")
    public abstract retrofit2.Call<java.util.List<com.android.bala.mvvmretrofit.model.user.User>> getUsers();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "https://jsonplaceholder.typicode.com/posts/")
    public abstract retrofit2.Call<java.util.List<com.android.bala.mvvmretrofit.model.post.Post>> getPost();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "https://jsonplaceholder.typicode.com/posts/1/comments/")
    public abstract retrofit2.Call<java.util.List<com.android.bala.mvvmretrofit.model.comment.Comment>> getComments();
}