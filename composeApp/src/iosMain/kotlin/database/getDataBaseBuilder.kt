package database

import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import data.database.StudentsDataBase
import data.database.instantiateImpl
import platform.Foundation.NSHomeDirectory

const val DATABASE_NAME = "students.db"
fun getDatabaseBuilder(): RoomDatabase.Builder<StudentsDataBase> {
    val dbFilePath = NSHomeDirectory() + "/$DATABASE_NAME"
    return Room.databaseBuilder<StudentsDataBase>(
        name = dbFilePath,
        factory =  { StudentsDataBase::class.instantiateImpl() }
    ).setDriver(BundledSQLiteDriver())
}