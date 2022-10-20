package tn.esprit.sprintproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintproject.Service.Iservice;
import tn.esprit.sprintproject.entities.Departement;

import java.util.List;

@RestController
@RequestMapping("/departement")
@AllArgsConstructor
public class DepartementController {
    private final Iservice<Departement> departementService;

    @PostMapping("post/")
    public Departement Create(@RequestBody Departement departement)
    {
        return departementService.Create(departement);
    }
    @GetMapping("/get")
    public List<Departement> Read()
    {
        return departementService.Read();
    }

    @PutMapping("/put/{ID}")
    public Departement update(@PathVariable int ID,@RequestBody Departement departement)
    {
        return departementService.Update(ID,departement);
    }

    @DeleteMapping("/delete/{ID}")
    public String delete(@PathVariable int ID)
    {
        return departementService.Delete(ID);
    }

}
