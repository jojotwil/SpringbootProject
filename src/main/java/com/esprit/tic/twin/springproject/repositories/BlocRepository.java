package com.esprit.tic.twin.springproject.repositories;

import com.esprit.tic.twin.springproject.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;



public interface BlocRepository extends JpaRepository<Bloc,Long> {

//keyword
List<Bloc> findByFoyerUniversiteNomUniversite(String nom);
    @Query("SELECT e FROM Bloc e JOIN e.foyer f WHERE f.universite.nomUniversite=:nomUniversite")
    List<Bloc> retrieveBlocByUniversite(@Param("nomUniversite") String nomUniversite);

}
