package com.susanadev.scheduleclasshours.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import data.database.StudentsDataBase

const val DATABASE_NAME = "students.db"
fun getDatabaseBuilder(ctx: Context): RoomDatabase.Builder<StudentsDataBase> {
    val appContext = ctx.applicationContext
    val dbFile = appContext.getDatabasePath(DATABASE_NAME)
    return Room.databaseBuilder<StudentsDataBase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}