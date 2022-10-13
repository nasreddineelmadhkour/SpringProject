package tn.esprit.sprintproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprintproject.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
