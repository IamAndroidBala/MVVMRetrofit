package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.ApiBuilder;
import com.android.bala.mvvmretrofit.network.GetPhotos;
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
public final class PostModule_ProvidePhotosApiFactory implements Factory<GetPhotos> {
  private final PostModule module;

  private final Provider<ApiBuilder> apiProvider;

  public PostModule_ProvidePhotosApiFactory(PostModule module, Provider<ApiBuilder> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public GetPhotos get() {
    return providePhotosApi(module, apiProvider.get());
  }

  public static PostModule_ProvidePhotosApiFactory create(PostModule module,
      Provider<ApiBuilder> apiProvider) {
    return new PostModule_ProvidePhotosApiFactory(module, apiProvider);
  }

  public static GetPhotos providePhotosApi(PostModule instance, ApiBuilder api) {
    return Preconditions.checkNotNull(instance.providePhotosApi(api), "Cannot return null from a non-@Nullable @Provides method");
  }
}
