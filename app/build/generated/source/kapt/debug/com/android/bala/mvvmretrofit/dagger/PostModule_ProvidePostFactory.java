package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.ApiBuilder;
import com.android.bala.mvvmretrofit.network.GetPosts;
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
public final class PostModule_ProvidePostFactory implements Factory<GetPosts> {
  private final PostModule module;

  private final Provider<ApiBuilder> apiProvider;

  public PostModule_ProvidePostFactory(PostModule module, Provider<ApiBuilder> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public GetPosts get() {
    return providePost(module, apiProvider.get());
  }

  public static PostModule_ProvidePostFactory create(PostModule module,
      Provider<ApiBuilder> apiProvider) {
    return new PostModule_ProvidePostFactory(module, apiProvider);
  }

  public static GetPosts providePost(PostModule instance, ApiBuilder api) {
    return Preconditions.checkNotNull(instance.providePost(api), "Cannot return null from a non-@Nullable @Provides method");
  }
}
