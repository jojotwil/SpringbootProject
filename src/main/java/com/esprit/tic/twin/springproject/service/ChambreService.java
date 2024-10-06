package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Chambre;
import com.esprit.tic.twin.springproject.repositories.ChambreRepository;

import java.util.List;

public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}