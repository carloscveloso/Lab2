package com.example.lab2

import android.content.Context
import androidx.room.*

@Entity(tableName = "notas")
data class Notas (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "descricao")
    val descricao: String,
    @ColumnInfo(name = "data")
    val data: String
)

