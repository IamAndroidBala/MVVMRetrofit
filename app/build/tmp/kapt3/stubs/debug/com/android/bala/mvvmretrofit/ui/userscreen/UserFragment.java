package com.android.bala.mvvmretrofit.ui.userscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020 H\u0016J\u0016\u0010%\u001a\u00020 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\'H\u0016J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u0007H\u0016J&\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020 H\u0016J\b\u00105\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00066"}, d2 = {"Lcom/android/bala/mvvmretrofit/ui/userscreen/UserFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/android/bala/mvvmretrofit/ui/userscreen/UserView;", "()V", "isVirgin", "", "mContext", "Landroid/content/Context;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "recyclerUser", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerUser", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerUser", "(Landroidx/recyclerview/widget/RecyclerView;)V", "thisList", "Ljava/util/ArrayList;", "Lcom/android/bala/mvvmretrofit/model/user/User;", "userAdapter", "Lcom/android/bala/mvvmretrofit/ui/userscreen/UserAdapter;", "userPresenterImpl", "Lcom/android/bala/mvvmretrofit/ui/userscreen/UserPresenterImpl;", "getUserPresenterImpl", "()Lcom/android/bala/mvvmretrofit/ui/userscreen/UserPresenterImpl;", "setUserPresenterImpl", "(Lcom/android/bala/mvvmretrofit/ui/userscreen/UserPresenterImpl;)V", "dismissLoading", "", "displayError", "error", "", "displayLoading", "displayResult", "result", "", "initView", "view", "Landroid/view/View;", "onAttach", "context", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onResume", "app_debug"})
public final class UserFragment extends androidx.fragment.app.Fragment implements com.android.bala.mvvmretrofit.ui.userscreen.UserView {
    private boolean isVirgin;
    private android.content.Context mContext;
    private java.util.ArrayList<com.android.bala.mvvmretrofit.model.user.User> thisList;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView recyclerUser;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ProgressBar progressBar;
    private com.android.bala.mvvmretrofit.ui.userscreen.UserAdapter userAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.android.bala.mvvmretrofit.ui.userscreen.UserPresenterImpl userPresenterImpl;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerUser() {
        return null;
    }
    
    public final void setRecyclerUser(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.bala.mvvmretrofit.ui.userscreen.UserPresenterImpl getUserPresenterImpl() {
        return null;
    }
    
    public final void setUserPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.userscreen.UserPresenterImpl p0) {
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
    
    private final void initView(android.view.View view) {
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
    java.util.List<com.android.bala.mvvmretrofit.model.user.User> result) {
    }
    
    @java.lang.Override()
    public void displayError(@org.jetbrains.annotations.Nullable()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public UserFragment() {
        super();
    }
}