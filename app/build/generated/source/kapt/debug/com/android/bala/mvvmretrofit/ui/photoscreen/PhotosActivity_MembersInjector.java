package com.android.bala.mvvmretrofit.ui.photoscreen;

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
public final class PhotosActivity_MembersInjector implements MembersInjector<PhotosActivity> {
  private final Provider<PhotosPresenterImpl> photosPresenterImplProvider;

  public PhotosActivity_MembersInjector(Provider<PhotosPresenterImpl> photosPresenterImplProvider) {
    this.photosPresenterImplProvider = photosPresenterImplProvider;
  }

  public static MembersInjector<PhotosActivity> create(
      Provider<PhotosPresenterImpl> photosPresenterImplProvider) {
    return new PhotosActivity_MembersInjector(photosPresenterImplProvider);}

  @Override
  public void injectMembers(PhotosActivity instance) {
    injectPhotosPresenterImpl(instance, photosPresenterImplProvider.get());
  }

  public static void injectPhotosPresenterImpl(PhotosActivity instance,
      PhotosPresenterImpl photosPresenterImpl) {
    instance.photosPresenterImpl = photosPresenterImpl;
  }
}
