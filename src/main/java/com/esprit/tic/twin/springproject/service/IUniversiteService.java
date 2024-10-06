package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversite();

    Universite addUniversite(Universite u);

    Universite updateUniversite(Universite u);

    Universite retrieveUniversite(Long idUniversite);

    void removeUniversite(Long idUniversite);
}