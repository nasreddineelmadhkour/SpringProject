package tn.esprit.sprintproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private int idUniv;
    @Getter @Setter private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    @Getter @Setter private Set<Departement> departements;
}
