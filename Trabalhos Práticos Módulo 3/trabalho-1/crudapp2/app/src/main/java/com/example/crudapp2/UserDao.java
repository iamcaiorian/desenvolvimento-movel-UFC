package com.example.crudapp2;


import androidx.room.*
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserUser(user : User): Long

    @Query("SELECT * FROM user_table")
    fun getAllUsers(): Flow<List<User>>

    @Update
    suspend fun updateUser(user: User): Int

    @Delete
    suspend fun deleteUser(user: User): Int
}
