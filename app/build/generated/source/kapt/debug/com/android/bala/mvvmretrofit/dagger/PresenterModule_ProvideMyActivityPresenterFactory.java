package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.GetPosts;
import com.android.bala.mvvmretrofit.ui.postscreen.PostPresenterImpl;
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
public final class PresenterModule_ProvideMyActivityPresenterFactory implements Factory<PostPresenterImpl> {
  private final PresenterModule module;

  private final Provider<GetPosts> postProvider;

  public PresenterModule_ProvideMyActivityPresenterFactory(PresenterModule module,
      Provider<GetPosts> postProvider) {
    this.module = module;
    this.postProvider = postProvider;
  }

  @Override
  public PostPresenterImpl get() {
    return provideMyActivityPresenter(module, postProvider.get());
  }

  public static PresenterModule_ProvideMyActivityPresenterFactory create(PresenterModule module,
      Provider<GetPosts> postProvider) {
    return new PresenterModule_ProvideMyActivityPresenterFactory(module, postProvider);
  }

  public static PostPresenterImpl provideMyActivityPresenter(PresenterModule instance,
      GetPosts post) {
    return Preconditions.checkNotNull(instance.provideMyActivityPresenter(post), "Cannot return null from a non-@Nullable @Provides method");
  }
}
