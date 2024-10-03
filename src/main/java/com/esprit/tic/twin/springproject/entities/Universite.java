package com.esprit.tic.twin.springproject.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;

    @OneToOne
    private Foyer foyer;
}

