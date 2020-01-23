package com.android.bala.mvvmretrofit.ui.postscreen;

import com.android.bala.mvvmretrofit.network.GetPosts;
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
public final class PostPresenter_Factory implements Factory<PostPresenter> {
  private final Provider<GetPosts> postProvider;

  public PostPresenter_Factory(Provider<GetPosts> postProvider) {
    this.postProvider = postProvider;
  }

  @Override
  public PostPresenter get() {
    return new PostPresenter(postProvider.get());
  }

  public static PostPresenter_Factory create(Provider<GetPosts> postProvider) {
    return new PostPresenter_Factory(postProvider);
  }

  public static PostPresenter newInstance(GetPosts post) {
    return new PostPresenter(post);
  }
}
