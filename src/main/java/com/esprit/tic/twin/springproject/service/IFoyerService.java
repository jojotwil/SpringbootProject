package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveALLFoyers();
    Foyer addFoyer(Foyer f);
    Foyer updateFoyer(Foyer f);
    Foyer retrieveFoyer(Long idFoyer);
    void removeFoyer(Long idFoyer);
}
