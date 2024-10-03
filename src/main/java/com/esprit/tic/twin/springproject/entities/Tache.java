package com.esprit.tic.twin.springproject.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
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

    @Column(name = "typeTache")
    private TypeTache typeTache;

    @ManyToOne
    private Etudiant etudiant;

}
