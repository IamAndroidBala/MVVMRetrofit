package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.GetAlbums;
import com.android.bala.mvvmretrofit.ui.albumscreen.AlbumPresenterImpl;
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
public final class PresenterModule_ProvideAlbumPresenterFactory implements Factory<AlbumPresenterImpl> {
  private final PresenterModule module;

  private final Provider<GetAlbums> albumsProvider;

  public PresenterModule_ProvideAlbumPresenterFactory(PresenterModule module,
      Provider<GetAlbums> albumsProvider) {
    this.module = module;
    this.albumsProvider = albumsProvider;
  }

  @Override
  public AlbumPresenterImpl get() {
    return provideAlbumPresenter(module, albumsProvider.get());
  }

  public static PresenterModule_ProvideAlbumPresenterFactory create(PresenterModule module,
      Provider<GetAlbums> albumsProvider) {
    return new PresenterModule_ProvideAlbumPresenterFactory(module, albumsProvider);
  }

  public static AlbumPresenterImpl provideAlbumPresenter(PresenterModule instance,
      GetAlbums albums) {
    return Preconditions.checkNotNull(instance.provideAlbumPresenter(albums), "Cannot return null from a non-@Nullable @Provides method");
  }
}
