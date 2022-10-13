package tn.esprit.sprintproject.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepart;
    private String nomDepart;

    @OneToMany(mappedBy = "departement")
    private Set<Etudiant> etudiants;


}
