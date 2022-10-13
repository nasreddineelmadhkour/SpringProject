package tn.esprit.sprintproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintproject.Repository.DepartementRepository;
import tn.esprit.sprintproject.entities.Departement;

import java.util.List;

@Service
@AllArgsConstructor

public class DepartementService implements Iservice<Departement>{

    private final DepartementRepository departementRepository;
    @Override
    public Departement Create(Departement T) {
        return departementRepository.save(T);
    }

    @Override
    public List<Departement> Read() {
        return departementRepository.findAll();
    }

    @Override
    public Departement Update(int ID, Departement T) {
        return departementRepository.findById(ID)
                .map(T2->{
                    T2.setNomDepart(T.getNomDepart());
                    T2.setEtudiants(T.getEtudiants());
                return departementRepository.save(T2);
                }).orElseThrow(() -> new RuntimeException("Departement non trouvé !"));
    }

    @Override
    public String Delete(int ID) {
        departementRepository.deleteById(ID);
        return "Supprimer Departement avec succes";
    }
}
