package data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class Student(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val surname: String,
    val course: String,
    val age: Int = 0,
    val repeater: Boolean = false,
    val address: String,
    val subjects: String,
    val pendingSubjects: String?,
    val school: String?,
    val phoneNumber: String,
    val parentsPhoneNumber: String?,
    val weekDay: String,
    val time: String,
    val tasks: String?,
    val observations: String?
    )