package tn.esprit.sprintproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int idEquipe;
    @Getter
    @Setter
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @OneToOne
    private DetailEquipe detailEquipe;

    @ManyToMany(mappedBy = "equipes", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
