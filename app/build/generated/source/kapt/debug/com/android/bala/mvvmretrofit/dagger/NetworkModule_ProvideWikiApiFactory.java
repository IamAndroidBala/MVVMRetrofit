package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.ApiBuilder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideWikiApiFactory implements Factory<ApiBuilder> {
  private final NetworkModule module;

  public NetworkModule_ProvideWikiApiFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public ApiBuilder get() {
    return provideWikiApi(module);
  }

  public static NetworkModule_ProvideWikiApiFactory create(NetworkModule module) {
    return new NetworkModule_ProvideWikiApiFactory(module);
  }

  public static ApiBuilder provideWikiApi(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.provideWikiApi(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
