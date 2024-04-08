package com.notesProject.notesProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.IdGeneratorType;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long notesId;

    @NotNull
    private String Notes;
}
