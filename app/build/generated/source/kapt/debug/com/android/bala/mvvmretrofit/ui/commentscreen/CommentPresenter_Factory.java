package com.android.bala.mvvmretrofit.ui.commentscreen;

import com.android.bala.mvvmretrofit.network.GetComments;
import dagger.internal.Factory;
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
public final class CommentPresenter_Factory implements Factory<CommentPresenter> {
  private final Provider<GetComments> commentProvider;

  public CommentPresenter_Factory(Provider<GetComments> commentProvider) {
    this.commentProvider = commentProvider;
  }

  @Override
  public CommentPresenter get() {
    return new CommentPresenter(commentProvider.get());
  }

  public static CommentPresenter_Factory create(Provider<GetComments> commentProvider) {
    return new CommentPresenter_Factory(commentProvider);
  }

  public static CommentPresenter newInstance(GetComments comment) {
    return new CommentPresenter(comment);
  }
}
