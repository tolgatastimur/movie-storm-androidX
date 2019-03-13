package com.tolgatastimur.moviestormandroidx.ui.intheaters

import android.app.Application
import com.tolgatastimur.moviestormandroidx.App
import com.tolgatastimur.moviestormandroidx.core.BaseViewModel
import com.tolgatastimur.moviestormandroidx.db.AppDatabase
import javax.inject.Inject

class InTheaterViewModel (app: Application):BaseViewModel(app) {
    @Inject
    lateinit var  db:AppDatabase

    init {
        (app as? App)?.component?.inject(this)
    }
}