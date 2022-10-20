package tn.esprit.sprintproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintproject.Repository.EquipeRepository;
import tn.esprit.sprintproject.entities.Equipe;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeService implements Iservice<Equipe>{

    private final EquipeRepository equipeRepository;


    @Override
    public Equipe Create(Equipe T) {
        return equipeRepository.save(T);
    }

    @Override
    public List<Equipe> Read() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe Update(int ID, Equipe T) {
        return equipeRepository.findById(ID)
                .map(T2->{
                    T2.setDetailEquipe(T.getDetailEquipe());
                    T2.setNiveau(T.getNiveau());
                    T2.setEtudiants(T.getEtudiants());
                    T2.setNomEquipe(T.getNomEquipe());

                return equipeRepository.save(T2);
                }).orElseThrow(()->new RuntimeException("Equipe non trouvé !"));
    }

    @Override
    public String Delete(int ID) {

        equipeRepository.deleteById(ID);
        return "Supprimer Equipe avec succes";
    }
}
