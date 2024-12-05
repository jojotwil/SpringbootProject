package com.esprit.tic.twin.springproject.repositories;

import com.esprit.tic.twin.springproject.entities.Bloc;
import com.esprit.tic.twin.springproject.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long>  {
    @Query("SELECT e FROM Etudiant e WHERE e.nomEt = :nom AND e.prenomEt = :prenom")
    Etudiant findByNomAndPrenom(@Param("nom") String nom, @Param("prenom") String prenom);
}
