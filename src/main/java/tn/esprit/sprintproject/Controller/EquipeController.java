package tn.esprit.sprintproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintproject.Service.Iservice;
import tn.esprit.sprintproject.entities.Equipe;

import java.util.List;

@RestController
@RequestMapping("/equipe")
@AllArgsConstructor
public class EquipeController {

    private final Iservice<Equipe> equipeService;

    @PostMapping("post/")
    public Equipe Create(@RequestBody Equipe equipe)
    {
        return equipeService.Create(equipe);
    }
    @GetMapping("/get")
    public List<Equipe> Read()
    {
        return equipeService.Read();
    }

    @PutMapping("/put/{ID}")
    public Equipe update(@PathVariable int ID,@RequestBody Equipe equipe)
    {
        return equipeService.Update(ID,equipe);
    }

    @DeleteMapping("/delete/{ID}")
    public String delete(@PathVariable int ID)
    {
        return equipeService.Delete(ID);
    }
}
