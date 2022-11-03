package tn.esprit.sprintproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintproject.Service.EtudiantService;
import tn.esprit.sprintproject.Service.Iservice;
import tn.esprit.sprintproject.entities.Etudiant;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {

    private final Iservice<Etudiant> etudiantService;
    EtudiantService etudiantService1;

    @PostMapping("post/")
    public Etudiant Create(@RequestBody Etudiant etudiant)
    {
        return etudiantService.Create(etudiant);
    }
    @GetMapping("/get")
    public List<Etudiant> Read()
    {
        return etudiantService.Read();
    }

    @PutMapping("/put/{ID}")
    public Etudiant update(@PathVariable int ID, @RequestBody Etudiant etudiant)
    {
        return etudiantService.Update(ID,etudiant);
    }

    @DeleteMapping("/delete/{ID}")
    public String delete(@PathVariable int ID)
    {
        return etudiantService.Delete(ID);
    }

    @PostMapping("/assignetudianttodepartement/{etudiantId}/{departementId}")
    public void assignEtudiantToDepartement (@PathVariable Integer etudiantId,@PathVariable Integer departementId){
        etudiantService1.assignEtudiantToDepartement(etudiantId,departementId);
    }

    @PostMapping("/addAndAssignEtudiantToEquipeAndContract/{idContrat}/{idEquipe}")
    Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,@PathVariable Integer idContrat,@PathVariable  Integer idEquipe)
    {
        return etudiantService1.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idEquipe);
    }
}
