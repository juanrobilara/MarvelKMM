package com.unlam.marvel.cache

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.marvel.data.cache.AppDatabase

class AndroidDatabaseDriverFactory(
    private val context: Context,
) : DatabaseDriverFactory {
    override fun createDriver(): SqlDriver =
        AndroidSqliteDriver(
            AppDatabase.Schema,
            context,
            "AppDatabase.db",
        )
}
