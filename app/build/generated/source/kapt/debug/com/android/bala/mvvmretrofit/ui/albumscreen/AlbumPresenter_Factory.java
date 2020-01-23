package com.android.bala.mvvmretrofit.ui.albumscreen;

import com.android.bala.mvvmretrofit.network.GetAlbums;
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
public final class AlbumPresenter_Factory implements Factory<AlbumPresenter> {
  private final Provider<GetAlbums> albumsProvider;

  public AlbumPresenter_Factory(Provider<GetAlbums> albumsProvider) {
    this.albumsProvider = albumsProvider;
  }

  @Override
  public AlbumPresenter get() {
    return new AlbumPresenter(albumsProvider.get());
  }

  public static AlbumPresenter_Factory create(Provider<GetAlbums> albumsProvider) {
    return new AlbumPresenter_Factory(albumsProvider);
  }

  public static AlbumPresenter newInstance(GetAlbums albums) {
    return new AlbumPresenter(albums);
  }
}
