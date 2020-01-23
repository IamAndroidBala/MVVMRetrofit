package com.android.bala.mvvmretrofit.ui.userscreen;

import com.android.bala.mvvmretrofit.network.GetUsers;
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
public final class UserPresenter_Factory implements Factory<UserPresenter> {
  private final Provider<GetUsers> getUsersProvider;

  public UserPresenter_Factory(Provider<GetUsers> getUsersProvider) {
    this.getUsersProvider = getUsersProvider;
  }

  @Override
  public UserPresenter get() {
    return new UserPresenter(getUsersProvider.get());
  }

  public static UserPresenter_Factory create(Provider<GetUsers> getUsersProvider) {
    return new UserPresenter_Factory(getUsersProvider);
  }

  public static UserPresenter newInstance(GetUsers getUsers) {
    return new UserPresenter(getUsers);
  }
}
