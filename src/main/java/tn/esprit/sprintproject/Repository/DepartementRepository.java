package tn.esprit.sprintproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprintproject.entities.Departement;


public interface DepartementRepository extends JpaRepository <Departement ,Integer>{
}
