package tn.esprit.sprintproject.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;

    @ManyToOne
    private Departement departement;

    @ManyToMany
    private Set<Equipe> equipes;

    @OneToMany(mappedBy = "etudiant")
    private Set<Contrat> contrats;

}
