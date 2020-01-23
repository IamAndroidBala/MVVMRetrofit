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
public final class CommonMethods_Factory implements Factory<CommonMethods> {
  private static final CommonMethods_Factory INSTANCE = new CommonMethods_Factory();

  @Override
  public CommonMethods get() {
    return new CommonMethods();
  }

  public static CommonMethods_Factory create() {
    return INSTANCE;
  }

  public static CommonMethods newInstance() {
    return new CommonMethods();
  }
}
