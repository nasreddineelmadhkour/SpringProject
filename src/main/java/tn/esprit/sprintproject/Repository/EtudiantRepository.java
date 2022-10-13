package tn.esprit.sprintproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprintproject.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
}
