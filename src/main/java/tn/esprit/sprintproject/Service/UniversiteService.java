package tn.esprit.sprintproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintproject.Repository.UniversiteRepository;
import tn.esprit.sprintproject.entities.Departement;
import tn.esprit.sprintproject.entities.Universite;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class UniversiteService implements Iservice<Universite> {
    private final UniversiteRepository universiteRepository;

    private final  DepartementService departementService;

    @Override
    public Universite Create(Universite T) {
        return universiteRepository.save(T);
    }

    @Override
    public List<Universite> Read() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite Update(int ID, Universite T) {
        return universiteRepository.findById(ID).map(
                T2->{
                    T2.setDepartements(T.getDepartements());
                    T2.setNomUniv(T.getNomUniv());
                    return universiteRepository.save(T2);
                }
        ).orElseThrow(() -> new RuntimeException("Universite non trouvé !"));

    }

    @Override
    public String Delete(int ID) {

        universiteRepository.deleteById(ID);

        return "Supprimer Universite avec succes";
    }

    @Override
    public Universite getOne(Integer ID) {
        return universiteRepository.findById(ID).get();
    }

    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement){
        universiteRepository.findById(idUniversite)
                .map(universite -> {
                     Set<Departement> departements=universite.getDepartements();
                    departements.add(departementService.getOne(idDepartement));
                    universite.setDepartements(departements);

                    return universiteRepository.save(universite);
                });
    }
}
