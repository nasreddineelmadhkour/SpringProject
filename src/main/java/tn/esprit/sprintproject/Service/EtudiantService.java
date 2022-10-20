package tn.esprit.sprintproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintproject.Repository.EtudiantRepository;
import tn.esprit.sprintproject.entities.Etudiant;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements Iservice<Etudiant> {
    private final EtudiantRepository etudiantRepository;
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
        return etudiantRepository.findById(ID)
                .map(T2->{
                    T2.setContrats(T.getContrats());
                    T2.setOption(T.getOption());
                    T2.setDepartement(T.getDepartement());
                    T2.setEquipes(T.getEquipes());
                    T2.setPrenomE(T.getPrenomE());
                    T2.setNomE(T.getNomE());

                    return etudiantRepository.save(T2);
                }).orElseThrow(()-> new RuntimeException("Etudiant non trouvé !"));
    }

    @Override
    public String Delete(int ID) {
        etudiantRepository.deleteById(ID);return "Supprimer Etudiant avec succes";
    }
}
