package tn.esprit.sprintproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.sprintproject.entities.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

    //JPQL
    @Query("select e from Etudiant e where e.nomE =?1 and e.prenomE =?2")
  //  @Query(value = "select * from table_etudiant e where e.etudiant_nom =?1 and e.prenomE =?2", nativeQuery = true)
    Etudiant retrieveEtudiantNomEtPrenom(String nom, String prenom);

    Etudiant findByNomEAndPrenomE(String nom, String prenom);

    List<Etudiant> findByDepartementNomDepart(String nom);


}
