package com.android.bala.mvvmretrofit.ui.commentscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\u0016\u0010#\u001a\u00020\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180%H\u0016J\u0012\u0010&\u001a\u00020\u001e2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006-"}, d2 = {"Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentView;", "()V", "commentAdapter", "Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentAdapter;", "getCommentAdapter", "()Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentAdapter;", "setCommentAdapter", "(Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentAdapter;)V", "commentPresenter", "Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentPresenterImpl;", "getCommentPresenter", "()Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentPresenterImpl;", "setCommentPresenter", "(Lcom/android/bala/mvvmretrofit/ui/commentscreen/CommentPresenterImpl;)V", "mPost", "Lcom/android/bala/mvvmretrofit/model/post/Post;", "getMPost", "()Lcom/android/bala/mvvmretrofit/model/post/Post;", "setMPost", "(Lcom/android/bala/mvvmretrofit/model/post/Post;)V", "thisList", "Ljava/util/ArrayList;", "Lcom/android/bala/mvvmretrofit/model/comment/Comment;", "getThisList", "()Ljava/util/ArrayList;", "setThisList", "(Ljava/util/ArrayList;)V", "dismissLoading", "", "displayError", "error", "", "displayLoading", "displayResult", "result", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class CommentsActivity extends androidx.appcompat.app.AppCompatActivity implements com.android.bala.mvvmretrofit.ui.commentscreen.CommentView {
    @org.jetbrains.annotations.NotNull()
    public com.android.bala.mvvmretrofit.ui.commentscreen.CommentAdapter commentAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.android.bala.mvvmretrofit.model.comment.Comment> thisList;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.android.bala.mvvmretrofit.ui.commentscreen.CommentPresenterImpl commentPresenter;
    @org.jetbrains.annotations.NotNull()
    public com.android.bala.mvvmretrofit.model.post.Post mPost;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.bala.mvvmretrofit.ui.commentscreen.CommentAdapter getCommentAdapter() {
        return null;
    }
    
    public final void setCommentAdapter(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.commentscreen.CommentAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.bala.mvvmretrofit.model.comment.Comment> getThisList() {
        return null;
    }
    
    public final void setThisList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.bala.mvvmretrofit.model.comment.Comment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.bala.mvvmretrofit.ui.commentscreen.CommentPresenterImpl getCommentPresenter() {
        return null;
    }
    
    public final void setCommentPresenter(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.ui.commentscreen.CommentPresenterImpl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.bala.mvvmretrofit.model.post.Post getMPost() {
        return null;
    }
    
    public final void setMPost(@org.jetbrains.annotations.NotNull()
    com.android.bala.mvvmretrofit.model.post.Post p0) {
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
    java.util.List<com.android.bala.mvvmretrofit.model.comment.Comment> result) {
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
    
    public CommentsActivity() {
        super();
    }
}