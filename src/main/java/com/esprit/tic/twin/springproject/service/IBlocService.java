package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Bloc;
import com.esprit.tic.twin.springproject.entities.Foyer;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveALLBloc();
    Bloc addBloc(Bloc f);
    Bloc updateBloc(Bloc f);
    Bloc retrieveBloc(Long idBloc);
    void removeBloc(Long idBloc);
}
