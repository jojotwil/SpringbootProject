package com.esprit.tic.twin.springproject.controller;

import com.esprit.tic.twin.springproject.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChambreContoller {
ChambreRepository chambreRepository;
}
