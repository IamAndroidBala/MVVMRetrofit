package com.android.bala.mvvmretrofit.utils;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppLog_Factory implements Factory<AppLog> {
  private static final AppLog_Factory INSTANCE = new AppLog_Factory();

  @Override
  public AppLog get() {
    return new AppLog();
  }

  public static AppLog_Factory create() {
    return INSTANCE;
  }

  public static AppLog newInstance() {
    return new AppLog();
  }
}
