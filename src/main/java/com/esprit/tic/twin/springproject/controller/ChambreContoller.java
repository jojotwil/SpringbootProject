package com.esprit.tic.twin.springproject.controller;

import com.esprit.tic.twin.springproject.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ChambreContoller {
ChambreRepository chambreRepository;
}
