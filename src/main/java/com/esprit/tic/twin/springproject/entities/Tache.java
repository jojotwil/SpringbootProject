package com.esprit.tic.twin.springproject.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tache")
public class Tache implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTache")
    private long idTache;

    @Column(name = "dateTache")
    private LocalDate dateTache;

    @Column(name = "duree")
    private int duree;

    @Column(name = "tarifHoraire")
    private float tarifHoraire;
    @Enumerated(EnumType.STRING)
    @Column(name = "typeTache")
    private TypeTache typeTache;

    @ManyToOne
    private Etudiant etudiant;
    @OneToOne(mappedBy = "tache")
    private Etudiant etudiantt;
}
