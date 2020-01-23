package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.ApiBuilder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

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

  private final Provider<OkHttpClient> clientProvider;

  private final Provider<HttpUrl.Builder> requestBuilderProvider;

  public NetworkModule_ProvideWikiApiFactory(NetworkModule module,
      Provider<OkHttpClient> clientProvider, Provider<HttpUrl.Builder> requestBuilderProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
    this.requestBuilderProvider = requestBuilderProvider;
  }

  @Override
  public ApiBuilder get() {
    return provideWikiApi(module, clientProvider.get(), requestBuilderProvider.get());
  }

  public static NetworkModule_ProvideWikiApiFactory create(NetworkModule module,
      Provider<OkHttpClient> clientProvider, Provider<HttpUrl.Builder> requestBuilderProvider) {
    return new NetworkModule_ProvideWikiApiFactory(module, clientProvider, requestBuilderProvider);
  }

  public static ApiBuilder provideWikiApi(NetworkModule instance, OkHttpClient client,
      HttpUrl.Builder requestBuilder) {
    return Preconditions.checkNotNull(instance.provideWikiApi(client, requestBuilder), "Cannot return null from a non-@Nullable @Provides method");
  }
}