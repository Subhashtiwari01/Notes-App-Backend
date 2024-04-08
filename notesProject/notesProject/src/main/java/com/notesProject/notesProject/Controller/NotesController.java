package com.notesProject.notesProject.Controller;

import com.notesProject.notesProject.Model.Notes;
import com.notesProject.notesProject.Service.NotesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NotesController {

    @Autowired
    NotesServices notesServices;


    @PostMapping("/addNote")

    public Notes addNotes(@RequestBody Notes notes){
        return notesServices.addNotes(notes);
    }

    @GetMapping("/allNotes")
    public List<Notes> allNotes(){
        return notesServices.allnotes();
    }
    @GetMapping("/getNotesById/{id}")
    public ResponseEntity<Notes> getNotesById(@PathVariable Long id) {
        Optional<Notes> optionalNote = notesServices.getNotesById(id);
        return optionalNote.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @DeleteMapping("/deleteNotes/{id}")
    public ResponseEntity<String> deleteNotes(@PathVariable Long id) {
        Notes deletedNote = notesServices.deleteNotes(id);
        if (deletedNote != null) {
            return ResponseEntity.ok("Note with ID " + id + " has been deleted");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
