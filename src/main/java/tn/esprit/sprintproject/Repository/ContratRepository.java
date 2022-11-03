package tn.esprit.sprintproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprintproject.entities.Contrat;

import java.util.Date;
import java.util.List;

public interface ContratRepository extends JpaRepository <Contrat,Integer> {

    List<Contrat> findByMontantContratGreaterThan(int montant);
    List<Contrat> findByDateFinContratBetween(Date dat1, Date date2);

}
