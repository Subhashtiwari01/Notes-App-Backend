package com.notesProject.notesProject.Repo;

import com.notesProject.notesProject.Model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotesRepo extends JpaRepository<Notes,Long> {
}
