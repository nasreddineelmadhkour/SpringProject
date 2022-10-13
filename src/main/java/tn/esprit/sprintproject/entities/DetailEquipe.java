package tn.esprit.sprintproject.entities;

import javax.persistence.*;

@Entity
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailEquipe;
    private int Salle;
    private String thematique;

    @OneToOne(mappedBy = "detailEquipe")
    private Equipe Equipe;
}
