package com.esprit.tic.twin.springproject.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private long idEtudiant;

    @Column(name = "nomEt")
    private String nomEt;

    @Column(name = "prenomEt")
    private String prenomEt;

    @Column(name = "cin")
    private long cin;

    @Column(name = "ecole")
    private String ecole;

    @Column(name = "dateNaissance")
    private Date dateNaissance;

    @Enumerated(EnumType.STRING)
    @Column(name = "typeEtudiant")
    private typeEtudiant typeEtudiant;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

   @OneToMany(cascade = CascadeType.ALL,mappedBy = "etudiant")
    private Set<Tache> taches;
    @OneToOne
    private Tache tache;
}