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
@Table( name = "Bloc")
@ToString
@EqualsAndHashCode
@Builder
public class Bloc implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
     long idBloc;
    @Column(name="nomBloc")
     String nomBloc;
    @Column(name="capaciteBloc")
     long capaciteBloc;

    @ManyToOne
     Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> chambres;


}