package com.chairul.mvvmposts.ui.post;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0014J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\u0016\u0010\"\u001a\u00020\u001d2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/chairul/mvvmposts/ui/post/PostListViewModel;", "Lcom/chairul/mvvmposts/base/BaseViewModel;", "postDao", "Lcom/chairul/mvvmposts/model/PostDao;", "(Lcom/chairul/mvvmposts/model/PostDao;)V", "errorClickListener", "Landroid/view/View$OnClickListener;", "getErrorClickListener", "()Landroid/view/View$OnClickListener;", "errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "loadingVisibility", "getLoadingVisibility", "postApi", "Lcom/chairul/mvvmposts/network/PostApi;", "getPostApi", "()Lcom/chairul/mvvmposts/network/PostApi;", "setPostApi", "(Lcom/chairul/mvvmposts/network/PostApi;)V", "postListAdapter", "Lcom/chairul/mvvmposts/ui/post/PostListAdapter;", "getPostListAdapter", "()Lcom/chairul/mvvmposts/ui/post/PostListAdapter;", "subscription", "Lio/reactivex/disposables/Disposable;", "loadPosts", "", "onCleared", "onRetrievePostListError", "onRetrievePostListFinish", "onRetrievePostListStart", "onRetrievePostListSuccess", "postList", "", "Lcom/chairul/mvvmposts/model/Post;", "app_debug"})
public final class PostListViewModel extends com.chairul.mvvmposts.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.chairul.mvvmposts.network.PostApi postApi;
    private io.reactivex.disposables.Disposable subscription;
    @org.jetbrains.annotations.NotNull()
    private final com.chairul.mvvmposts.ui.post.PostListAdapter postListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> loadingVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener errorClickListener = null;
    private final com.chairul.mvvmposts.model.PostDao postDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.chairul.mvvmposts.network.PostApi getPostApi() {
        return null;
    }
    
    public final void setPostApi(@org.jetbrains.annotations.NotNull()
    com.chairul.mvvmposts.network.PostApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.chairul.mvvmposts.ui.post.PostListAdapter getPostListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLoadingVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getErrorClickListener() {
        return null;
    }
    
    private final void loadPosts() {
    }
    
    private final void onRetrievePostListStart() {
    }
    
    private final void onRetrievePostListFinish() {
    }
    
    private final void onRetrievePostListSuccess(java.util.List<com.chairul.mvvmposts.model.Post> postList) {
    }
    
    private final void onRetrievePostListError() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public PostListViewModel(@org.jetbrains.annotations.NotNull()
    com.chairul.mvvmposts.model.PostDao postDao) {
        super();
    }
}