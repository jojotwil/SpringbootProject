package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Etudiant;
import com.esprit.tic.twin.springproject.entities.Tache;
import com.esprit.tic.twin.springproject.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public List<Tache> addTasksAndAffectToEtudiant(List<Task> tasks, String nomEt, String prenomEt) {
        return null;
    }
}