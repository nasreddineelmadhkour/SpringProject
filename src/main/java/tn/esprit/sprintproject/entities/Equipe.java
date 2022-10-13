package tn.esprit.sprintproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Getter @Setter private int idEquipe ;
    @Getter @Setter private String nomEquipe;
    @Enumerated(EnumType.STRING) @Getter @Setter private Niveau niveau;

    @OneToOne @Getter @Setter private DetailEquipe detailEquipe;

    @ManyToMany(mappedBy = "equipes") @Getter @Setter private Set<Etudiant> etudiants;
}
