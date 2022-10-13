package tn.esprit.sprintproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Getter @Setter private int idDepart;
    @Getter @Setter private String nomDepart;
    @Getter @Setter @OneToMany(mappedBy = "departement") private Set<Etudiant> etudiants;


}
