package tn.esprit.sprintproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintproject.Service.Iservice;
import tn.esprit.sprintproject.entities.Etudiant;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {

    private final Iservice<Etudiant> etudiantService;

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
}
