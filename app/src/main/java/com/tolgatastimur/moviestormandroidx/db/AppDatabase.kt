package com.tolgatastimur.moviestormandroidx.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tolgatastimur.moviestormandroidx.db.dao.ExampleDao
import com.tolgatastimur.moviestormandroidx.db.entities.Example

@Database(entities = arrayOf(Example::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}