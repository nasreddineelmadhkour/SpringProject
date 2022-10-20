package tn.esprit.sprintproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintproject.Repository.DetailEquipeRepository;
import tn.esprit.sprintproject.entities.DetailEquipe;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailEquipeService implements Iservice<DetailEquipe> {

    private final DetailEquipeRepository detailEquipeRepository;
    @Override
    public DetailEquipe Create(DetailEquipe T) {
        return detailEquipeRepository.save(T);
    }

    @Override
    public List<DetailEquipe> Read() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe Update(int ID, DetailEquipe T) {
        return detailEquipeRepository.findById(ID)
                .map(T2->
                { T2.setEquipe(T.getEquipe());
                    T2.setSalle(T.getSalle());
                    T2.setThematique(T.getThematique());


                    return detailEquipeRepository.save(T2);
                }).orElseThrow(() -> new RuntimeException("DetailEquipe non trouvé !"));
    }

    @Override
    public String Delete(int ID) {

        detailEquipeRepository.deleteById(ID);
        return "Supprimer DetailEquipe avec succes";
    }
}
