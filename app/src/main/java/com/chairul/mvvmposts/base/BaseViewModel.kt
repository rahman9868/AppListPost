package com.chairul.mvvmposts.base

import androidx.lifecycle.ViewModel
import com.chairul.mvvmposts.injection.component.ViewModelInjector
import com.chairul.mvvmposts.injection.component.DaggerViewModelInjector
import com.chairul.mvvmposts.injection.module.NetworkModule
import com.chairul.mvvmposts.ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}