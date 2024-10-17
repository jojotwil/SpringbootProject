package com.esprit.tic.twin.springproject.controller;

import com.esprit.tic.twin.springproject.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationController {
    ReservationRepository reservationRepository;
}
