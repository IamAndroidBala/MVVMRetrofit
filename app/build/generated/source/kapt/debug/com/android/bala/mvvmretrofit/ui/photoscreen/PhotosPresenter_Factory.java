package com.android.bala.mvvmretrofit.ui.photoscreen;

import com.android.bala.mvvmretrofit.network.GetPhotos;
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
public final class PhotosPresenter_Factory implements Factory<PhotosPresenter> {
  private final Provider<GetPhotos> albumsProvider;

  public PhotosPresenter_Factory(Provider<GetPhotos> albumsProvider) {
    this.albumsProvider = albumsProvider;
  }

  @Override
  public PhotosPresenter get() {
    return new PhotosPresenter(albumsProvider.get());
  }

  public static PhotosPresenter_Factory create(Provider<GetPhotos> albumsProvider) {
    return new PhotosPresenter_Factory(albumsProvider);
  }

  public static PhotosPresenter newInstance(GetPhotos albums) {
    return new PhotosPresenter(albums);
  }
}
