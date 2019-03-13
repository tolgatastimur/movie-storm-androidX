package com.tolgatastimur.moviestormandroidx.di.component

import android.content.Context
import android.content.SharedPreferences
import com.tolgatastimur.moviestormandroidx.App
import com.tolgatastimur.moviestormandroidx.di.module.ApplicationModule
import com.tolgatastimur.moviestormandroidx.di.module.DatabaseModule
import com.tolgatastimur.moviestormandroidx.ui.main.MainActivityViewModel

import com.tolgatastimur.moviestormandroidx.di.module.NetModule
import com.tolgatastimur.moviestormandroidx.ui.intheaters.InTheaterFragment
import com.tolgatastimur.moviestormandroidx.ui.intheaters.InTheaterViewModel
import com.tolgatastimur.moviestormandroidx.ui.movies.MoviesViewModel

import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = arrayOf(ApplicationModule::class,NetModule::class,DatabaseModule::class))


interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)
    fun inject(inTheaterViewModel: InTheaterViewModel)
    fun inject(moviesViewModel: MoviesViewModel)
}
