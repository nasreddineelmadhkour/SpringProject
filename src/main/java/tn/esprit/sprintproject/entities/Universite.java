package tn.esprit.sprintproject.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniv;
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;
}
