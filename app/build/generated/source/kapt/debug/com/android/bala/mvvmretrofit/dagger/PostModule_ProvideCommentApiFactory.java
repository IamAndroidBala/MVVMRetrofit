package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.ApiBuilder;
import com.android.bala.mvvmretrofit.network.GetComments;
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
public final class PostModule_ProvideCommentApiFactory implements Factory<GetComments> {
  private final PostModule module;

  private final Provider<ApiBuilder> apiProvider;

  public PostModule_ProvideCommentApiFactory(PostModule module, Provider<ApiBuilder> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public GetComments get() {
    return provideCommentApi(module, apiProvider.get());
  }

  public static PostModule_ProvideCommentApiFactory create(PostModule module,
      Provider<ApiBuilder> apiProvider) {
    return new PostModule_ProvideCommentApiFactory(module, apiProvider);
  }

  public static GetComments provideCommentApi(PostModule instance, ApiBuilder api) {
    return Preconditions.checkNotNull(instance.provideCommentApi(api), "Cannot return null from a non-@Nullable @Provides method");
  }
}
