package com.esprit.tic.twin.springproject.service;

import com.esprit.tic.twin.springproject.entities.Chambre;
import com.esprit.tic.twin.springproject.entities.TypeChambre;
import com.esprit.tic.twin.springproject.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ChambreService implements IChambreService{

    private ChambreRepository chambreRepository;
    @Override
    @Scheduled(fixedDelay = 16000)
    public void pourcentageChambreParTypeChambre() {
        List<Chambre> chambres = chambreRepository.findAll();
        TypeChambre[] typeChambres = TypeChambre.values();
        for (TypeChambre typeChambre : typeChambres) {
            long nbrChambreType = chambres.stream().filter(c->c.getTypeC().equals(typeChambre)).count();
            double pourcentage = (double)nbrChambreType / (double)chambres.size() * 100;

            log.info("Pourcentage de chambre de type {} est de {}",typeChambre,pourcentage);
        }

    }

    @Override
    @Scheduled(fixedDelay = 5000)
    public void nbPlacesDisponiblesParChambreAnneeEnCours() {
        List<Chambre> chambres = chambreRepository.findAll();
        chambres.forEach(chambre -> {
            long totalReservations = chambre.getReservation().stream()
                    .filter(reservation -> reservation.getAnneeUniversitaire().getYear() == LocalDate.now().getYear())
                    .count();
            long placesDisponibles = chambre.getBloc().getCapaciteBloc() - totalReservations;
            log.info("Chambre numéro {} : {} places disponibles pour l'année en cours", chambre.getNumeroChambre(), placesDisponibles);
        });

    }
}