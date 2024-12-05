package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Etudiant;
import com.esprit.tic.twin.springproject.entities.Tache;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiant();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Long idEtudiant);
    void removeEtudiant(Long idEtudiant);
    List<Tache> addTasksAndAffectToEtudiant (List<Task> tasks, String nomEt, String prenomEt ) ;
}