package com.example.crudapp2;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;

import kotlin.jvm.Volatile;

@Database(entities = [User:class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase{
            return INSTANCE ?: synchronized (this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "user_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()

                INSTACE = instance
                instance
            }
        }
    }
}
