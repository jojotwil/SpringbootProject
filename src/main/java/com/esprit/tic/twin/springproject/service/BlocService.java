package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Bloc;
import com.esprit.tic.twin.springproject.repositories.BlocRepository;

import java.util.List;

public class BlocService implements IBlocService{
    BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc f) {
        return blocRepository.save(f);
    }

    @Override
    public List<Bloc> retrieveALLBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public Bloc updateBloc(Bloc f) {
        return blocRepository.save(f);
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
}
