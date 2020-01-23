package com.android.bala.mvvmretrofit.network;

import dagger.internal.Factory;
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
public final class ApiBuilder_Factory implements Factory<ApiBuilder> {
  private final Provider<OkHttpClient> clientProvider;

  private final Provider<HttpUrl.Builder> requestBuilderProvider;

  public ApiBuilder_Factory(Provider<OkHttpClient> clientProvider,
      Provider<HttpUrl.Builder> requestBuilderProvider) {
    this.clientProvider = clientProvider;
    this.requestBuilderProvider = requestBuilderProvider;
  }

  @Override
  public ApiBuilder get() {
    return new ApiBuilder(clientProvider.get(), requestBuilderProvider.get());
  }

  public static ApiBuilder_Factory create(Provider<OkHttpClient> clientProvider,
      Provider<HttpUrl.Builder> requestBuilderProvider) {
    return new ApiBuilder_Factory(clientProvider, requestBuilderProvider);
  }

  public static ApiBuilder newInstance(OkHttpClient client, HttpUrl.Builder requestBuilder) {
    return new ApiBuilder(client, requestBuilder);
  }
}
