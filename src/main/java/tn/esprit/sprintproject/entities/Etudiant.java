package tn.esprit.sprintproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
@Table(name = "table_etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String prenomE;
    @Column(name = "etudiant_nom")
     private String nomE;
    @Enumerated(EnumType.STRING)
  private Option option;

    @ManyToOne
     private Departement departement;

    @ManyToMany(cascade = CascadeType.ALL)
     private Set<Equipe> equipes = new HashSet<>();

    @OneToMany(mappedBy = "etudiant")
     private Set<Contrat> contrats;

}
