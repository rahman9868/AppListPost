package com.chairul.mvvmposts.injection.component;

import com.chairul.mvvmposts.injection.module.NetworkModule;
import com.chairul.mvvmposts.injection.module.NetworkModule_ProvidePostApi$app_debugFactory;
import com.chairul.mvvmposts.injection.module.NetworkModule_ProvideRetrofitInterface$app_debugFactory;
import com.chairul.mvvmposts.network.PostApi;
import com.chairul.mvvmposts.ui.post.PostListViewModel;
import com.chairul.mvvmposts.ui.post.PostListViewModel_MembersInjector;
import dagger.internal.SingleCheck;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerViewModelInjector implements ViewModelInjector {
  private Provider<Retrofit> provideRetrofitInterface$app_debugProvider;

  private Provider<PostApi> providePostApi$app_debugProvider;

  private DaggerViewModelInjector(Builder builder) {
    initialize(builder);
  }

  public static ViewModelInjector.Builder builder() {
    return new Builder();
  }

  public static ViewModelInjector create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideRetrofitInterface$app_debugProvider =
        SingleCheck.provider(NetworkModule_ProvideRetrofitInterface$app_debugFactory.create());
    this.providePostApi$app_debugProvider =
        SingleCheck.provider(
            NetworkModule_ProvidePostApi$app_debugFactory.create(
                provideRetrofitInterface$app_debugProvider));
  }

  @Override
  public void inject(PostListViewModel postListViewModel) {
    injectPostListViewModel(postListViewModel);
  }

  private PostListViewModel injectPostListViewModel(PostListViewModel instance) {
    PostListViewModel_MembersInjector.injectPostApi(
        instance, providePostApi$app_debugProvider.get());
    return instance;
  }

  private static final class Builder implements ViewModelInjector.Builder {
    @Override
    public ViewModelInjector build() {
      return new DaggerViewModelInjector(this);
    }

    /**
     * This module is declared, but an instance is not used in the component. This method is a
     * no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Override
    public Builder networkModule(NetworkModule networkModule) {
      return this;
    }
  }
}
