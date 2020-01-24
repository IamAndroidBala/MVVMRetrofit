package com.android.bala.mvvmretrofit.dagger

import com.android.bala.mvvmretrofit.network.*
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PostModule {

  @Provides
  @Singleton
  fun providePost(api       : ApiBuilder)   = GetPosts(api)

  @Provides
  @Singleton
  fun provideAlbumApi(api   : ApiBuilder)   = GetAlbums(api)

  @Provides
  @Singleton
  fun provideUsersApi(api   : ApiBuilder)   = GetUsers(api)

  @Provides
  @Singleton
  fun provideCommentApi(api : ApiBuilder)   = GetComments(api)

  @Provides
  @Singleton
  fun providePhotosApi(api  : ApiBuilder)   = GetPhotos(api)

}