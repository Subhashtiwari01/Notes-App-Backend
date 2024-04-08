package com.notesProject.notesProject.Service;

import com.notesProject.notesProject.Model.Notes;
import com.notesProject.notesProject.Repo.INotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotesServices {
    @Autowired
    INotesRepo notesRepo;


    public Notes addNotes(Notes notes) {
        return notesRepo.save(notes);
    }

    public List<Notes> allnotes() {
        return notesRepo.findAll();
    }

    public Notes deleteNotes(Long id) {
        Optional<Notes> optionalNote = notesRepo.findById(id);
        if (optionalNote.isPresent()) {
            Notes noteToDelete = optionalNote.get();
            notesRepo.delete(noteToDelete);
            return noteToDelete;
        } else {
            return null;
        }
    }

    public Optional<Notes> getNotesById(Long id) {
        return notesRepo.findById(id);
    }
}
