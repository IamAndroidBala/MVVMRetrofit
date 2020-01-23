package com.android.bala.mvvmretrofit.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/android/bala/mvvmretrofit/dagger/AppComponent;", "", "inject", "", "target", "Lcom/android/bala/mvvmretrofit/ui/albumscreen/AlbumFragment;", "Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentsActivity;", "Lcom/android/bala/mvvmretrofit/ui/photoscreen/PhotosActivity;", "Lcom/android/bala/mvvmretrofit/ui/postscreen/PostFragment;", "Lcom/android/bala/mvvmretrofit/ui/userscreen/UserFragment;", "app_debug"})
@dagger.Component(modules = {com.android.bala.mvvmretrofit.dagger.AppModule.class, com.android.bala.mvvmretrofit.dagger.PresenterModule.class, com.android.bala.mvvmretrofit.dagger.NetworkModule.class, com.android.bala.mvvmretrofit.dagger.PostModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.postscreen.PostFragment target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.albumscreen.AlbumFragment target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.userscreen.UserFragment target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.commentscreen.CommentsActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.photoscreen.PhotosActivity target);
}