package com.MyNotesmanik.eazynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MyNotesmanik.eazynotes.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
