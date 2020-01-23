/*
 * Copyright (c) 2017 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 */

package com.android.bala.mvvmretrofit.dagger

import com.android.bala.mvvmretrofit.network.*
import com.android.bala.mvvmretrofit.ui.albumscreen.AlbumPresenter
import com.android.bala.mvvmretrofit.ui.albumscreen.AlbumPresenterImpl
import com.android.bala.mvvmretrofit.ui.commentscreen.CommentPresenter
import com.android.bala.mvvmretrofit.ui.commentscreen.CommentPresenterImpl
import com.android.bala.mvvmretrofit.ui.photoscreen.PhotosPresenter
import com.android.bala.mvvmretrofit.ui.photoscreen.PhotosPresenterImpl
import com.android.bala.mvvmretrofit.ui.postscreen.PostPresenterImpl
import com.android.bala.mvvmretrofit.ui.postscreen.PostPresenter
import com.android.bala.mvvmretrofit.ui.userscreen.UserPresenter
import com.android.bala.mvvmretrofit.ui.userscreen.UserPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class PresenterModule {

  @Provides
  @Singleton
  fun provideMyActivityPresenter(post: GetPosts) : PostPresenterImpl  = PostPresenter(post)

  @Provides
  @Singleton
  fun provideAlbumPresenter (albums : GetAlbums) : AlbumPresenterImpl = AlbumPresenter(albums)

  @Provides
  @Singleton
  fun provideUserPresenter (users : GetUsers)    : UserPresenterImpl  = UserPresenter(users)

  @Provides
  @Singleton
  fun provideCommentPresenter (comments : GetComments)    : CommentPresenterImpl  = CommentPresenter(comments)

  @Provides
  @Singleton
  fun providePhotosPresenter (photos : GetPhotos)       : PhotosPresenterImpl  = PhotosPresenter(photos)

}