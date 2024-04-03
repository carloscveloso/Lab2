package com.example.lab2.repository

import androidx.lifecycle.LiveData
import com.example.lab2.dao.NoteDao
import com.example.lab2.entities.Note

class NoteRepository(private val noteDao: NoteDao) {
    val readAllNotes : LiveData<List<Note>> = noteDao.readAllNotes()

    suspend fun addNote(note: Note){
        noteDao.addNote(note)
    }

    suspend fun updateNote(note: Note){
        noteDao.updateNote(note)
    }

    suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}