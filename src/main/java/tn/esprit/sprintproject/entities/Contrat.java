package tn.esprit.sprintproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contrat implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Getter @Setter private int idContrat;
    @Temporal(TemporalType.DATE) @Getter @Setter private Date dateDebutContrat;
    @Temporal(TemporalType.DATE) @Getter @Setter private Date dateFinContrat;
    @Getter @Setter private boolean archive;
    @Getter @Setter private int montantContrat;
    @Enumerated(EnumType.STRING) @Getter @Setter private Specialite specialite;
    @ManyToOne @Getter @Setter private Etudiant etudiant;

}
