package com.tolgatastimur.moviestormandroidx.ui.movies

import android.app.Application
import com.tolgatastimur.moviestormandroidx.App
import com.tolgatastimur.moviestormandroidx.core.BaseViewModel

class MoviesViewModel(app:Application):BaseViewModel(app){
    init {
        (app as? App)?.component?.inject(this)
    }
}