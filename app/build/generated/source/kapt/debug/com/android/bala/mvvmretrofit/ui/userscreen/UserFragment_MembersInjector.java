package com.android.bala.mvvmretrofit.ui.userscreen;

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
public final class UserFragment_MembersInjector implements MembersInjector<UserFragment> {
  private final Provider<UserPresenterImpl> userPresenterImplProvider;

  public UserFragment_MembersInjector(Provider<UserPresenterImpl> userPresenterImplProvider) {
    this.userPresenterImplProvider = userPresenterImplProvider;
  }

  public static MembersInjector<UserFragment> create(
      Provider<UserPresenterImpl> userPresenterImplProvider) {
    return new UserFragment_MembersInjector(userPresenterImplProvider);}

  @Override
  public void injectMembers(UserFragment instance) {
    injectUserPresenterImpl(instance, userPresenterImplProvider.get());
  }

  public static void injectUserPresenterImpl(UserFragment instance,
      UserPresenterImpl userPresenterImpl) {
    instance.userPresenterImpl = userPresenterImpl;
  }
}
