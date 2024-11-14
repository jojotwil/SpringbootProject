package com.esprit.tic.twin.springproject.controller;

import com.esprit.tic.twin.springproject.entities.Bloc;
import com.esprit.tic.twin.springproject.repositories.BlocRepository;
import com.esprit.tic.twin.springproject.service.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {
    IBlocService blocService;
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getEtudiants() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        if(listBlocs.isEmpty()) {
            return null;
        }else return listBlocs;
    }
    @PostMapping("/add-bloc")
    public Bloc addBloc(Bloc f) {
        return blocService.addBloc(f);
    }
    @PutMapping("/update-bloc")
    public Bloc updateBloc(@RequestBody Bloc e) {
        return blocService.updateBloc(e);
    }

    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long blocId) {
        blocService.removeBloc(blocId);
    }

    @GetMapping("/find-bloc-keyword/{universityName}")
    public List<Bloc> findBlocsByUniversityName(@PathVariable("universityName") String universityName) {
        return blocService.findBlocsByUniversityName(universityName);
    }

    // http://localhost:8090/projet/bloc/find-bloc-jpql
    @GetMapping("/find-bloc-jpql/{universityName}")
    public List<Bloc> retrieveBlocByUniversity(@PathVariable("universityName") String universityName) {
        return blocService.retrieveBlocByUniversity(universityName);
    }
}