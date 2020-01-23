package com.android.bala.mvvmretrofit.ui.albumscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/android/bala/mvvmretrofit/ui/albumscreen/AlbumPresenter;", "Lcom/android/bala/mvvmretrofit/ui/albumscreen/AlbumPresenterImpl;", "albums", "Lcom/android/bala/mvvmretrofit/network/GetAlbums;", "(Lcom/android/bala/mvvmretrofit/network/GetAlbums;)V", "albumView", "Lcom/android/bala/mvvmretrofit/ui/albumscreen/AlbumView;", "setLoading", "", "setPage", "alBumView", "app_debug"})
public final class AlbumPresenter implements com.android.bala.mvvmretrofit.ui.albumscreen.AlbumPresenterImpl {
    private com.android.bala.mvvmretrofit.ui.albumscreen.AlbumView albumView;
    private final com.android.bala.mvvmretrofit.network.GetAlbums albums = null;
    
    @java.lang.Override()
    public void setLoading() {
    }
    
    @java.lang.Override()
    public void setPage(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.albumscreen.AlbumView alBumView) {
    }
    
    @javax.inject.Inject()
    public AlbumPresenter(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.network.GetAlbums albums) {
        super();
    }
}