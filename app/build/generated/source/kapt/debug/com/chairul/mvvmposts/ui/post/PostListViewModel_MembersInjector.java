package com.chairul.mvvmposts.ui.post;

import com.chairul.mvvmposts.network.PostApi;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PostListViewModel_MembersInjector implements MembersInjector<PostListViewModel> {
  private final Provider<PostApi> postApiProvider;

  public PostListViewModel_MembersInjector(Provider<PostApi> postApiProvider) {
    this.postApiProvider = postApiProvider;
  }

  public static MembersInjector<PostListViewModel> create(Provider<PostApi> postApiProvider) {
    return new PostListViewModel_MembersInjector(postApiProvider);
  }

  @Override
  public void injectMembers(PostListViewModel instance) {
    injectPostApi(instance, postApiProvider.get());
  }

  public static void injectPostApi(PostListViewModel instance, PostApi postApi) {
    instance.postApi = postApi;
  }
}
