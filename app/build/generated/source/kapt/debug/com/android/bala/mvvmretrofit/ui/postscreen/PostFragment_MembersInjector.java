package com.android.bala.mvvmretrofit.ui.postscreen;

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
public final class PostFragment_MembersInjector implements MembersInjector<PostFragment> {
  private final Provider<PostPresenterImpl> myActivityPresenterProvider;

  public PostFragment_MembersInjector(Provider<PostPresenterImpl> myActivityPresenterProvider) {
    this.myActivityPresenterProvider = myActivityPresenterProvider;
  }

  public static MembersInjector<PostFragment> create(
      Provider<PostPresenterImpl> myActivityPresenterProvider) {
    return new PostFragment_MembersInjector(myActivityPresenterProvider);}

  @Override
  public void injectMembers(PostFragment instance) {
    injectMyActivityPresenter(instance, myActivityPresenterProvider.get());
  }

  public static void injectMyActivityPresenter(PostFragment instance,
      PostPresenterImpl myActivityPresenter) {
    instance.myActivityPresenter = myActivityPresenter;
  }
}
