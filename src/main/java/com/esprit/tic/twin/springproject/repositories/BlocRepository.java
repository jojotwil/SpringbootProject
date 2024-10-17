package com.esprit.tic.twin.springproject.repositories;

import com.esprit.tic.twin.springproject.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;



public interface BlocRepository extends JpaRepository<Bloc,Long> {

//keyword
List<Bloc> findByFoyerUniversiteIdUniversite(Long idUniversite);


}
