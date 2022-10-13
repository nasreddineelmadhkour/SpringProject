package tn.esprit.sprintproject.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe ;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToOne
    private DetailEquipe detailEquipe;

    @ManyToMany(mappedBy = "equipes")
    private Set<Etudiant> etudiants;
}
