package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Bloc;
import com.esprit.tic.twin.springproject.entities.Chambre;
import com.esprit.tic.twin.springproject.repositories.BlocRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
@Slf4j
public class BlocService implements IBlocService{
    BlocRepository blocRepository;
    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }
    @Override
    public Bloc addBloc(Bloc f) {
        return blocRepository.save(f);
    }
    @Override
    public Bloc updateBloc(Bloc f) {
        return blocRepository.save(f);
    }
    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }
    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
    @Override
    public List<Bloc> findBlocsByUniversityName(String nom) {
        return blocRepository.findByFoyerUniversiteNomUniversite(nom);
    }

    @Override
    public List<Bloc> retrieveBlocByUniversity(String nom) {
        return blocRepository.retrieveBlocByUniversite(nom);
    }



    @Scheduled(fixedDelay = 17000)
    public void listChambresParBloc(){
        List<Bloc> blocList = blocRepository.findAll();
        blocList.forEach(bloc -> {
            log.info("Bloc: {} ayant la capacite de: {}", bloc.getNomBloc(), bloc.getCapaciteBloc());
            log.info("Liste des chambres de bloc {}:",bloc.getNomBloc());
            Set<Chambre> chambres = bloc.getChambres();
            chambres.forEach(chambre -> log.info("chambre numéro {} de type {}",chambre.getNumeroChambre(),chambre.getTypeC()));
        });
    }

}
