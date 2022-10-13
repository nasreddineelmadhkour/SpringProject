package tn.esprit.sprintproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprintproject.entities.Contrat;

public interface ContratRepository extends JpaRepository <Contrat,Integer> {

}
