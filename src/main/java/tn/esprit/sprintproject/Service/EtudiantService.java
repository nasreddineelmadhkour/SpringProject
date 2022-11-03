package tn.esprit.sprintproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintproject.Repository.ContratRepository;
import tn.esprit.sprintproject.Repository.DepartementRepository;
import tn.esprit.sprintproject.Repository.EquipeRepository;
import tn.esprit.sprintproject.Repository.EtudiantRepository;
import tn.esprit.sprintproject.entities.Contrat;
import tn.esprit.sprintproject.entities.Departement;
import tn.esprit.sprintproject.entities.Equipe;
import tn.esprit.sprintproject.entities.Etudiant;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements Iservice<Etudiant> {
    private final EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository;
    ContratRepository contratRepository;
    EquipeRepository equipeRepository;
    private final DepartementService departementService;

    private final ContratService contratService;
    private final EquipeService equipeService;

    @Override
    public Etudiant Create(Etudiant T) {
        return etudiantRepository.save(T);
    }

    @Override
    public List<Etudiant> Read() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant Update(int ID, Etudiant T) {
        return etudiantRepository.findById(ID).map(T2 -> {
            T2.setContrats(T.getContrats());
            T2.setOption(T.getOption());
            T2.setDepartement(T.getDepartement());
            T2.setEquipes(T.getEquipes());
            T2.setPrenomE(T.getPrenomE());
            T2.setNomE(T.getNomE());

            return etudiantRepository.save(T2);
        }).orElseThrow(() -> new RuntimeException("Etudiant non trouvé !"));
    }

    @Override
    public String Delete(int ID) {
        etudiantRepository.deleteById(ID);
        return "Supprimer Etudiant avec succes";
    }

    @Override
    public Etudiant getOne(Integer ID) {
        return etudiantRepository.findById(ID).get();
    }

   /* public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        etudiantRepository.findById(etudiantId).map(etudiant -> {
            etudiant.setDepartement(departementService.getOne(departementId));
            return etudiantRepository.save(etudiant);
        });

    }*/

  /*  public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {

        etudiantRepository.save(e);
        return etudiantRepository.findById(e.getIdEtudiant()).map(etudiant -> {
            //Set<Equipe> equipes =etudiant.getEquipes();
            //equipes.add(equipeService.getOne(idEquipe));
            //etudiant.setEquipes(equipes);

            return etudiantRepository.save(etudiant);

        }).get();

    }
*/

    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId){
    Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
    Departement departement = departementRepository.findById(departementId).orElse(null);
    etudiant.setDepartement(departement);
        etudiantRepository.save(etudiant);

    }

    @Transactional
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe){

        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        contrat.setEtudiant(e);
        e.getEquipes().add(equipe);
        return etudiantRepository.save(e);

    }

}
