package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.GetComments;
import com.android.bala.mvvmretrofit.ui.commentscreen.CommentPresenterImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class PresenterModule_ProvideCommentPresenterFactory implements Factory<CommentPresenterImpl> {
  private final PresenterModule module;

  private final Provider<GetComments> commentsProvider;

  public PresenterModule_ProvideCommentPresenterFactory(PresenterModule module,
      Provider<GetComments> commentsProvider) {
    this.module = module;
    this.commentsProvider = commentsProvider;
  }

  @Override
  public CommentPresenterImpl get() {
    return provideCommentPresenter(module, commentsProvider.get());
  }

  public static PresenterModule_ProvideCommentPresenterFactory create(PresenterModule module,
      Provider<GetComments> commentsProvider) {
    return new PresenterModule_ProvideCommentPresenterFactory(module, commentsProvider);
  }

  public static CommentPresenterImpl provideCommentPresenter(PresenterModule instance,
      GetComments comments) {
    return Preconditions.checkNotNull(instance.provideCommentPresenter(comments), "Cannot return null from a non-@Nullable @Provides method");
  }
}
