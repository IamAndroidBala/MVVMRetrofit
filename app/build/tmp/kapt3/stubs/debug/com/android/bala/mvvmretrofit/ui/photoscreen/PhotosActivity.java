package com.android.bala.mvvmretrofit.ui.photoscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u0016\u0010\u001f\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180!H\u0016J\u0012\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/android/bala/mvvmretrofit/ui/photoscreen/PhotosActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/android/bala/mvvmretrofit/ui/photoscreen/PhotoView;", "()V", "mAlbum", "Lcom/android/bala/mvvmretrofit/model/album/Album;", "getMAlbum", "()Lcom/android/bala/mvvmretrofit/model/album/Album;", "setMAlbum", "(Lcom/android/bala/mvvmretrofit/model/album/Album;)V", "photoAdapter", "Lcom/android/bala/mvvmretrofit/ui/photoscreen/PhotoAdapter;", "getPhotoAdapter", "()Lcom/android/bala/mvvmretrofit/ui/photoscreen/PhotoAdapter;", "setPhotoAdapter", "(Lcom/android/bala/mvvmretrofit/ui/photoscreen/PhotoAdapter;)V", "photosPresenterImpl", "Lcom/android/bala/mvvmretrofit/ui/photoscreen/PhotosPresenterImpl;", "getPhotosPresenterImpl", "()Lcom/android/bala/mvvmretrofit/ui/photoscreen/PhotosPresenterImpl;", "setPhotosPresenterImpl", "(Lcom/android/bala/mvvmretrofit/ui/photoscreen/PhotosPresenterImpl;)V", "thisList", "Ljava/util/ArrayList;", "Lcom/android/bala/mvvmretrofit/model/photos/Photos;", "dismissLoading", "", "displayError", "error", "", "displayLoading", "displayResult", "result", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class PhotosActivity extends androidx.appcompat.app.AppCompatActivity implements com.android.bala.mvvmretrofit.ui.photoscreen.PhotoView {
    @org.jetbrains.annotations.NotNull()
    public com.android.bala.mvvmretrofit.model.album.Album mAlbum;
    @org.jetbrains.annotations.NotNull()
    public com.android.bala.mvvmretrofit.ui.photoscreen.PhotoAdapter photoAdapter;
    private java.util.ArrayList<com.android.bala.mvvmretrofit.model.photos.Photos> thisList;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.android.bala.mvvmretrofit.ui.photoscreen.PhotosPresenterImpl photosPresenterImpl;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.bala.mvvmretrofit.model.album.Album getMAlbum() {
        return null;
    }
    
    public final void setMAlbum(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.model.album.Album p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.bala.mvvmretrofit.ui.photoscreen.PhotoAdapter getPhotoAdapter() {
        return null;
    }
    
    public final void setPhotoAdapter(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.photoscreen.PhotoAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.bala.mvvmretrofit.ui.photoscreen.PhotosPresenterImpl getPhotosPresenterImpl() {
        return null;
    }
    
    public final void setPhotosPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.photoscreen.PhotosPresenterImpl p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void displayLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    @java.lang.Override()
    public void displayResult(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.bala.mvvmretrofit.model.photos.Photos> result) {
    }
    
    @java.lang.Override()
    public void displayError(@org.jetbrains.annotations.Nullable()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    public PhotosActivity() {
        super();
    }
}