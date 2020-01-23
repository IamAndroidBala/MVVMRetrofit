package com.android.bala.mvvmretrofit.ui.albumscreen;

import dagger.MembersInjector;
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
public final class AlbumFragment_MembersInjector implements MembersInjector<AlbumFragment> {
  private final Provider<AlbumPresenterImpl> albumPresenterProvider;

  public AlbumFragment_MembersInjector(Provider<AlbumPresenterImpl> albumPresenterProvider) {
    this.albumPresenterProvider = albumPresenterProvider;
  }

  public static MembersInjector<AlbumFragment> create(
      Provider<AlbumPresenterImpl> albumPresenterProvider) {
    return new AlbumFragment_MembersInjector(albumPresenterProvider);}

  @Override
  public void injectMembers(AlbumFragment instance) {
    injectAlbumPresenter(instance, albumPresenterProvider.get());
  }

  public static void injectAlbumPresenter(AlbumFragment instance,
      AlbumPresenterImpl albumPresenter) {
    instance.albumPresenter = albumPresenter;
  }
}
