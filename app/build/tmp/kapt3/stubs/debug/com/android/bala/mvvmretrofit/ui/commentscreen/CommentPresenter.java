package com.android.bala.mvvmretrofit.ui.commentscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentPresenter;", "Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentPresenterImpl;", "comment", "Lcom/android/bala/mvvmretrofit/network/GetComments;", "(Lcom/android/bala/mvvmretrofit/network/GetComments;)V", "commentView", "Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentView;", "setLoading", "", "setPage", "app_debug"})
public final class CommentPresenter implements com.android.bala.mvvmretrofit.ui.commentscreen.CommentPresenterImpl {
    private com.android.bala.mvvmretrofit.ui.commentscreen.CommentView commentView;
    private final com.android.bala.mvvmretrofit.network.GetComments comment = null;
    
    @java.lang.Override()
    public void setPage(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.commentscreen.CommentView commentView) {
    }
    
    @java.lang.Override()
    public void setLoading() {
    }
    
    @javax.inject.Inject()
    public CommentPresenter(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.network.GetComments comment) {
        super();
    }
}