package com.android.bala.mvvmretrofit.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/android/bala/mvvmretrofit/dagger/PostModule;", "", "()V", "provideAlbumApi", "Lcom/android/bala/mvvmretrofit/network/GetAlbums;", "api", "Lcom/android/bala/mvvmretrofit/network/ApiBuilder;", "provideCommentApi", "Lcom/android/bala/mvvmretrofit/network/GetComments;", "providePhotosApi", "Lcom/android/bala/mvvmretrofit/network/GetPhotos;", "providePost", "Lcom/android/bala/mvvmretrofit/network/GetPosts;", "provideUsersApi", "Lcom/android/bala/mvvmretrofit/network/GetUsers;", "app_debug"})
@dagger.Module()
public final class PostModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.bala.mvvmretrofit.network.GetPosts providePost(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.network.ApiBuilder api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.bala.mvvmretrofit.network.GetAlbums provideAlbumApi(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.network.ApiBuilder api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.bala.mvvmretrofit.network.GetUsers provideUsersApi(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.network.ApiBuilder api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.bala.mvvmretrofit.network.GetComments provideCommentApi(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.network.ApiBuilder api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.bala.mvvmretrofit.network.GetPhotos providePhotosApi(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.network.ApiBuilder api) {
        return null;
    }
    
    public PostModule() {
        super();
    }
}