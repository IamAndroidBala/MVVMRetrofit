package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.GetUsers;
import com.android.bala.mvvmretrofit.ui.userscreen.UserPresenterImpl;
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
public final class PresenterModule_ProvideUserPresenterFactory implements Factory<UserPresenterImpl> {
  private final PresenterModule module;

  private final Provider<GetUsers> usersProvider;

  public PresenterModule_ProvideUserPresenterFactory(PresenterModule module,
      Provider<GetUsers> usersProvider) {
    this.module = module;
    this.usersProvider = usersProvider;
  }

  @Override
  public UserPresenterImpl get() {
    return provideUserPresenter(module, usersProvider.get());
  }

  public static PresenterModule_ProvideUserPresenterFactory create(PresenterModule module,
      Provider<GetUsers> usersProvider) {
    return new PresenterModule_ProvideUserPresenterFactory(module, usersProvider);
  }

  public static UserPresenterImpl provideUserPresenter(PresenterModule instance, GetUsers users) {
    return Preconditions.checkNotNull(instance.provideUserPresenter(users), "Cannot return null from a non-@Nullable @Provides method");
  }
}
