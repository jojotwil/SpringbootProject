package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation(Reservation r);

    Reservation updateReservation(Reservation r);

    Reservation retrieveReservation(String idReservation);

    void removeReservation(String idReservation);
}