package tn.esprit.sprintproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private int idEtudiant;
    @Getter @Setter private String prenomE;
    @Getter @Setter private String nomE;
    @Enumerated(EnumType.STRING)
    @Getter @Setter private Option option;

    @ManyToOne
    @Getter @Setter private Departement departement;

    @ManyToMany
    @Getter @Setter private Set<Equipe> equipes;

    @OneToMany(mappedBy = "etudiant")
    @Getter @Setter private Set<Contrat> contrats;

}
