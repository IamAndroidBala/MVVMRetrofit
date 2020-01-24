package com.android.bala.mvvmretrofit.network;

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
public final class ApiBuilder_Factory implements Factory<ApiBuilder> {
  private static final ApiBuilder_Factory INSTANCE = new ApiBuilder_Factory();

  @Override
  public ApiBuilder get() {
    return new ApiBuilder();
  }

  public static ApiBuilder_Factory create() {
    return INSTANCE;
  }

  public static ApiBuilder newInstance() {
    return new ApiBuilder();
  }
}
