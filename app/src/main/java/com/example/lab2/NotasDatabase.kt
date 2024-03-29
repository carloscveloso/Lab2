package com.example.lab2


import android.content.Context
import androidx.room.*

@Database(entities = [Notas::class], version = 1, exportSchema = false)
abstract class NotasDatabase : RoomDatabase() {
    abstract fun notaDao(): NotaDao

    companion object {
        @Volatile
        private var INSTANCE: NotasDatabase? = null

        fun getDatabase(context: Context): NotasDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NotasDatabase::class.java,
                    "notas_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}