package data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import data.model.Student

const val DATABASE_NAME = "students.db"

@Database(entities = [Student::class], version = 1, exportSchema = false)
abstract class StudentsDataBase : RoomDatabase(), DB {
    abstract fun studentsDao(): StudentsDAO
    override fun clearAllTables() {
        super.clearAllTables()
    }

}

// FIXME: Added a hack to resolve below issue:
// Class 'AppDatabase_Impl' is not abstract and does not implement abstract base class member 'clearAllTables'.
interface DB {
    fun clearAllTables() {}
}