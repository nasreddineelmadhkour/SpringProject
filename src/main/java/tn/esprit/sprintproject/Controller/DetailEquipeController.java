package tn.esprit.sprintproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintproject.Service.Iservice;
import tn.esprit.sprintproject.entities.DetailEquipe;

import java.util.List;

@RestController
@RequestMapping("/detailequipe")
@AllArgsConstructor
public class DetailEquipeController {

    private final Iservice<DetailEquipe> detailEquipeService;

    @PostMapping("post/")
    public DetailEquipe Create(@RequestBody DetailEquipe detailequipe)
    {
        return detailEquipeService.Create(detailequipe);
    }
    @GetMapping("/get")
    public List<DetailEquipe> Read()
    {
        return detailEquipeService.Read();
    }

    @PutMapping("/put/{ID}")
    public DetailEquipe update(@PathVariable int ID, @RequestBody DetailEquipe detailequipe)
    {
        return detailEquipeService.Update(ID,detailequipe);
    }

    @DeleteMapping("/delete/{ID}")
    public String delete(@PathVariable int ID)
    {
        return detailEquipeService.Delete(ID);
    }
}
