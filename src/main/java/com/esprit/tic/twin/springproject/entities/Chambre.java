package com.esprit.tic.twin.springproject.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private long idChambre;
    @Column(name="numeroChambre")
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    @Column(name = "typeC")
    private TypeChambre typeC;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservation;
    @ManyToOne
    private Bloc bloc;
}