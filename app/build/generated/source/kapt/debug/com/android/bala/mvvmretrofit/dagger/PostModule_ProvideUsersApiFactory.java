package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.ApiBuilder;
import com.android.bala.mvvmretrofit.network.GetUsers;
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
public final class PostModule_ProvideUsersApiFactory implements Factory<GetUsers> {
  private final PostModule module;

  private final Provider<ApiBuilder> apiProvider;

  public PostModule_ProvideUsersApiFactory(PostModule module, Provider<ApiBuilder> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public GetUsers get() {
    return provideUsersApi(module, apiProvider.get());
  }

  public static PostModule_ProvideUsersApiFactory create(PostModule module,
      Provider<ApiBuilder> apiProvider) {
    return new PostModule_ProvideUsersApiFactory(module, apiProvider);
  }

  public static GetUsers provideUsersApi(PostModule instance, ApiBuilder api) {
    return Preconditions.checkNotNull(instance.provideUsersApi(api), "Cannot return null from a non-@Nullable @Provides method");
  }
}
