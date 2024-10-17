package com.esprit.tic.twin.springproject.controller;

import com.esprit.tic.twin.springproject.repositories.TacheRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TacheController {
    TacheRepository tacheRepository;
}
