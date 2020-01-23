package com.android.bala.mvvmretrofit.dagger;

import com.android.bala.mvvmretrofit.network.ApiBuilder;
import com.android.bala.mvvmretrofit.network.GetAlbums;
import com.android.bala.mvvmretrofit.network.GetComments;
import com.android.bala.mvvmretrofit.network.GetPhotos;
import com.android.bala.mvvmretrofit.network.GetPosts;
import com.android.bala.mvvmretrofit.network.GetUsers;
import com.android.bala.mvvmretrofit.ui.albumscreen.AlbumFragment;
import com.android.bala.mvvmretrofit.ui.albumscreen.AlbumFragment_MembersInjector;
import com.android.bala.mvvmretrofit.ui.albumscreen.AlbumPresenterImpl;
import com.android.bala.mvvmretrofit.ui.commentscreen.CommentPresenterImpl;
import com.android.bala.mvvmretrofit.ui.commentscreen.CommentsActivity;
import com.android.bala.mvvmretrofit.ui.commentscreen.CommentsActivity_MembersInjector;
import com.android.bala.mvvmretrofit.ui.photoscreen.PhotosActivity;
import com.android.bala.mvvmretrofit.ui.photoscreen.PhotosActivity_MembersInjector;
import com.android.bala.mvvmretrofit.ui.photoscreen.PhotosPresenterImpl;
import com.android.bala.mvvmretrofit.ui.postscreen.PostFragment;
import com.android.bala.mvvmretrofit.ui.postscreen.PostFragment_MembersInjector;
import com.android.bala.mvvmretrofit.ui.postscreen.PostPresenterImpl;
import com.android.bala.mvvmretrofit.ui.userscreen.UserFragment;
import com.android.bala.mvvmretrofit.ui.userscreen.UserFragment_MembersInjector;
import com.android.bala.mvvmretrofit.ui.userscreen.UserPresenterImpl;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<OkHttpClient> provideHttpClientProvider;

  private Provider<String> provideBaseUrlStringProvider;

  private Provider<HttpUrl.Builder> provideRequestBuilderProvider;

  private Provider<ApiBuilder> provideWikiApiProvider;

  private Provider<GetPosts> providePostProvider;

  private Provider<PostPresenterImpl> provideMyActivityPresenterProvider;

  private Provider<GetAlbums> provideAlbumApiProvider;

  private Provider<AlbumPresenterImpl> provideAlbumPresenterProvider;

  private Provider<GetUsers> provideUsersApiProvider;

  private Provider<UserPresenterImpl> provideUserPresenterProvider;

  private Provider<GetComments> provideCommentApiProvider;

  private Provider<CommentPresenterImpl> provideCommentPresenterProvider;

  private Provider<GetPhotos> providePhotosApiProvider;

  private Provider<PhotosPresenterImpl> providePhotosPresenterProvider;

  private DaggerAppComponent(PresenterModule presenterModuleParam, NetworkModule networkModuleParam,
      PostModule postModuleParam) {

    initialize(presenterModuleParam, networkModuleParam, postModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final PresenterModule presenterModuleParam,
      final NetworkModule networkModuleParam, final PostModule postModuleParam) {
    this.provideHttpClientProvider = DoubleCheck.provider(NetworkModule_ProvideHttpClientFactory.create(networkModuleParam));
    this.provideBaseUrlStringProvider = NetworkModule_ProvideBaseUrlStringFactory.create(networkModuleParam);
    this.provideRequestBuilderProvider = DoubleCheck.provider(NetworkModule_ProvideRequestBuilderFactory.create(networkModuleParam, provideBaseUrlStringProvider));
    this.provideWikiApiProvider = DoubleCheck.provider(NetworkModule_ProvideWikiApiFactory.create(networkModuleParam, provideHttpClientProvider, provideRequestBuilderProvider));
    this.providePostProvider = DoubleCheck.provider(PostModule_ProvidePostFactory.create(postModuleParam, provideWikiApiProvider));
    this.provideMyActivityPresenterProvider = DoubleCheck.provider(PresenterModule_ProvideMyActivityPresenterFactory.create(presenterModuleParam, providePostProvider));
    this.provideAlbumApiProvider = DoubleCheck.provider(PostModule_ProvideAlbumApiFactory.create(postModuleParam, provideWikiApiProvider));
    this.provideAlbumPresenterProvider = DoubleCheck.provider(PresenterModule_ProvideAlbumPresenterFactory.create(presenterModuleParam, provideAlbumApiProvider));
    this.provideUsersApiProvider = DoubleCheck.provider(PostModule_ProvideUsersApiFactory.create(postModuleParam, provideWikiApiProvider));
    this.provideUserPresenterProvider = DoubleCheck.provider(PresenterModule_ProvideUserPresenterFactory.create(presenterModuleParam, provideUsersApiProvider));
    this.provideCommentApiProvider = DoubleCheck.provider(PostModule_ProvideCommentApiFactory.create(postModuleParam, provideWikiApiProvider));
    this.provideCommentPresenterProvider = DoubleCheck.provider(PresenterModule_ProvideCommentPresenterFactory.create(presenterModuleParam, provideCommentApiProvider));
    this.providePhotosApiProvider = DoubleCheck.provider(PostModule_ProvidePhotosApiFactory.create(postModuleParam, provideWikiApiProvider));
    this.providePhotosPresenterProvider = DoubleCheck.provider(PresenterModule_ProvidePhotosPresenterFactory.create(presenterModuleParam, providePhotosApiProvider));
  }

  @Override
  public void inject(PostFragment target) {
    injectPostFragment(target);}

  @Override
  public void inject(AlbumFragment target) {
    injectAlbumFragment(target);}

  @Override
  public void inject(UserFragment target) {
    injectUserFragment(target);}

  @Override
  public void inject(CommentsActivity target) {
    injectCommentsActivity(target);}

  @Override
  public void inject(PhotosActivity target) {
    injectPhotosActivity(target);}

  private PostFragment injectPostFragment(PostFragment instance) {
    PostFragment_MembersInjector.injectMyActivityPresenter(instance, provideMyActivityPresenterProvider.get());
    return instance;
  }

  private AlbumFragment injectAlbumFragment(AlbumFragment instance) {
    AlbumFragment_MembersInjector.injectAlbumPresenter(instance, provideAlbumPresenterProvider.get());
    return instance;
  }

  private UserFragment injectUserFragment(UserFragment instance) {
    UserFragment_MembersInjector.injectUserPresenterImpl(instance, provideUserPresenterProvider.get());
    return instance;
  }

  private CommentsActivity injectCommentsActivity(CommentsActivity instance) {
    CommentsActivity_MembersInjector.injectCommentPresenter(instance, provideCommentPresenterProvider.get());
    return instance;
  }

  private PhotosActivity injectPhotosActivity(PhotosActivity instance) {
    PhotosActivity_MembersInjector.injectPhotosPresenterImpl(instance, providePhotosPresenterProvider.get());
    return instance;
  }

  public static final class Builder {
    private PresenterModule presenterModule;

    private NetworkModule networkModule;

    private PostModule postModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder presenterModule(PresenterModule presenterModule) {
      this.presenterModule = Preconditions.checkNotNull(presenterModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder postModule(PostModule postModule) {
      this.postModule = Preconditions.checkNotNull(postModule);
      return this;
    }

    public AppComponent build() {
      if (presenterModule == null) {
        this.presenterModule = new PresenterModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (postModule == null) {
        this.postModule = new PostModule();
      }
      return new DaggerAppComponent(presenterModule, networkModule, postModule);
    }
  }
}
