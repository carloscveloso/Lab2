package com.example.lab2

import android.content.Context
import androidx.room.*

@Dao
interface NotaDao {
    @Insert
    fun adicionarNota(notas: Notas)

    @Query("SELECT * FROM notas")
    fun obterTodasNotas(): List<Notas>

    @Update
    fun atualizarNota(notas: Notas)

    @Delete
    fun deletarNota(notas: Notas)
}