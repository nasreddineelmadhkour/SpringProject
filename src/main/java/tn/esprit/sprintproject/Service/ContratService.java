package tn.esprit.sprintproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintproject.Repository.ContratRepository;
import tn.esprit.sprintproject.entities.Contrat;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements Iservice<Contrat>{
    private final ContratRepository contratRepository;

    @Override
    public Contrat Create(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> Read() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat Update(int ID, Contrat contrat) {
        return contratRepository.findById(ID)
                .map(contrat1 -> {
                    contrat1.setMontantContrat(contrat.getMontantContrat());
                    contrat1.setDateDebutContrat(contrat.getDateDebutContrat());
                    contrat1.setDateFinContrat(contrat.getDateFinContrat());
                    contrat1.setSpecialite(contrat.getSpecialite());
                    contrat1.setEtudiant(contrat.getEtudiant());
                    contrat1.setArchive(contrat.isArchive());

                    return contratRepository.save(contrat1);
                }).orElseThrow(() -> new RuntimeException("Contrat non trouvé !"));
    }

    @Override
    public String Delete(int ID ){
        contratRepository.deleteById(ID);
        return "Contrat supprimer avec succes";
    }
}
