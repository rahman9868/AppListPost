package com.chairul.mvvmposts.injection.component;

import java.lang.System;

/**
 * Component providing inject() methods for presenters.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/chairul/mvvmposts/injection/component/ViewModelInjector;", "", "inject", "", "postListViewModel", "Lcom/chairul/mvvmposts/ui/post/PostListViewModel;", "Builder", "app_debug"})
@dagger.Component(modules = {com.chairul.mvvmposts.injection.module.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface ViewModelInjector {
    
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.chairul.mvvmposts.ui.post.PostListViewModel postListViewModel);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/chairul/mvvmposts/injection/component/ViewModelInjector$Builder;", "", "build", "Lcom/chairul/mvvmposts/injection/component/ViewModelInjector;", "networkModule", "Lcom/chairul/mvvmposts/injection/module/NetworkModule;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.chairul.mvvmposts.injection.component.ViewModelInjector build();
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.chairul.mvvmposts.injection.component.ViewModelInjector.Builder networkModule(@org.jetbrains.annotations.NotNull()
        com.chairul.mvvmposts.injection.module.NetworkModule networkModule);
    }
}