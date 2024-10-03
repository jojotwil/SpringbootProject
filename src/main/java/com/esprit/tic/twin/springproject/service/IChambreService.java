package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre c);
    List<Chambre> retrieveAllChambre();
    Chambre retrieveChambre(Long idChambre);
    Chambre updateChambre(Chambre c);
    void removeChambre(Long idChambre);
}