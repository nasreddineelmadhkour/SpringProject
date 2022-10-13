package tn.esprit.sprintproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprintproject.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Integer> {
}
