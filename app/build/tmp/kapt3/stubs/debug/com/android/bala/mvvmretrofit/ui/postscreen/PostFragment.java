package com.android.bala.mvvmretrofit.ui.postscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020 H\u0016J\u0016\u0010%\u001a\u00020 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\'H\u0016J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u0007H\u0016J&\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020 H\u0016J\b\u00105\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00066"}, d2 = {"Lcom/android/bala/mvvmretrofit/ui/postscreen/PostFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/android/bala/mvvmretrofit/ui/postscreen/PostView;", "()V", "isVirgin", "", "mContext", "Landroid/content/Context;", "myActivityPresenter", "Lcom/android/bala/mvvmretrofit/ui/postscreen/PostPresenterImpl;", "getMyActivityPresenter", "()Lcom/android/bala/mvvmretrofit/ui/postscreen/PostPresenterImpl;", "setMyActivityPresenter", "(Lcom/android/bala/mvvmretrofit/ui/postscreen/PostPresenterImpl;)V", "postAdapter", "Lcom/android/bala/mvvmretrofit/ui/postscreen/PostAdapter;", "postList", "Ljava/util/ArrayList;", "Lcom/android/bala/mvvmretrofit/model/post/Post;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "recyclerPost", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerPost", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerPost", "(Landroidx/recyclerview/widget/RecyclerView;)V", "dismissLoading", "", "displayError", "error", "", "displayLoading", "displayResult", "result", "", "initViews", "view", "Landroid/view/View;", "onAttach", "context", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onResume", "app_debug"})
public final class PostFragment extends androidx.fragment.app.Fragment implements com.android.bala.mvvmretrofit.ui.postscreen.PostView {
    private boolean isVirgin;
    private java.util.ArrayList<com.android.bala.mvvmretrofit.model.post.Post> postList;
    private com.android.bala.mvvmretrofit.ui.postscreen.PostAdapter postAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.android.bala.mvvmretrofit.ui.postscreen.PostPresenterImpl myActivityPresenter;
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView recyclerPost;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ProgressBar progressBar;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.bala.mvvmretrofit.ui.postscreen.PostPresenterImpl getMyActivityPresenter() {
        return null;
    }
    
    public final void setMyActivityPresenter(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.postscreen.PostPresenterImpl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerPost() {
        return null;
    }
    
    public final void setRecyclerPost(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initViews(android.view.View view) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void displayLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    @java.lang.Override()
    public void displayResult(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.bala.mvvmretrofit.model.post.Post> result) {
    }
    
    @java.lang.Override()
    public void displayError(@org.jetbrains.annotations.Nullable()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public PostFragment() {
        super();
    }
}