package data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import data.model.Student
import kotlinx.coroutines.flow.Flow

@Dao
interface StudentsDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(student: Student)

    @Query("SELECT * FROM students")
    fun getAllStudents(): Flow<List<Student>>

    @Delete
    suspend fun DeleteStudent(student: Student)

}