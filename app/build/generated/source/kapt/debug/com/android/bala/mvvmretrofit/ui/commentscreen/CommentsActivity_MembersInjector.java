package com.android.bala.mvvmretrofit.ui.commentscreen;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CommentsActivity_MembersInjector implements MembersInjector<CommentsActivity> {
  private final Provider<CommentPresenterImpl> commentPresenterProvider;

  public CommentsActivity_MembersInjector(Provider<CommentPresenterImpl> commentPresenterProvider) {
    this.commentPresenterProvider = commentPresenterProvider;
  }

  public static MembersInjector<CommentsActivity> create(
      Provider<CommentPresenterImpl> commentPresenterProvider) {
    return new CommentsActivity_MembersInjector(commentPresenterProvider);}

  @Override
  public void injectMembers(CommentsActivity instance) {
    injectCommentPresenter(instance, commentPresenterProvider.get());
  }

  public static void injectCommentPresenter(CommentsActivity instance,
      CommentPresenterImpl commentPresenter) {
    instance.commentPresenter = commentPresenter;
  }
}
