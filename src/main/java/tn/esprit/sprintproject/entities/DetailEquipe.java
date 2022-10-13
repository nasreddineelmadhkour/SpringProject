package tn.esprit.sprintproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)@Getter
    @Setter
    private int idDetailEquipe;
    @Getter @Setter private int Salle;
    @Getter @Setter private String thematique;

    @OneToOne(mappedBy = "detailEquipe")
    @Getter @Setter private Equipe Equipe;
}
