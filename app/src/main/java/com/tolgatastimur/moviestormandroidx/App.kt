package com.tolgatastimur.moviestormandroidx

import com.tolgatastimur.moviestormandroidx.di.component.DaggerApplicationComponent
import com.tolgatastimur.moviestormandroidx.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

