package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.GetPhotos;
import com.android.bala.mvvmretrofit.ui.photoscreen.PhotosPresenterImpl;
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
public final class PresenterModule_ProvidePhotosPresenterFactory implements Factory<PhotosPresenterImpl> {
  private final PresenterModule module;

  private final Provider<GetPhotos> photosProvider;

  public PresenterModule_ProvidePhotosPresenterFactory(PresenterModule module,
      Provider<GetPhotos> photosProvider) {
    this.module = module;
    this.photosProvider = photosProvider;
  }

  @Override
  public PhotosPresenterImpl get() {
    return providePhotosPresenter(module, photosProvider.get());
  }

  public static PresenterModule_ProvidePhotosPresenterFactory create(PresenterModule module,
      Provider<GetPhotos> photosProvider) {
    return new PresenterModule_ProvidePhotosPresenterFactory(module, photosProvider);
  }

  public static PhotosPresenterImpl providePhotosPresenter(PresenterModule instance,
      GetPhotos photos) {
    return Preconditions.checkNotNull(instance.providePhotosPresenter(photos), "Cannot return null from a non-@Nullable @Provides method");
  }
}
