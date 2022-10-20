package tn.esprit.sprintproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintproject.Service.Iservice;
import tn.esprit.sprintproject.entities.Contrat;

import java.util.List;

@RestController
@RequestMapping("/contrat")
@AllArgsConstructor
public class ContratController {
    private final Iservice<Contrat> contratService;
    @PostMapping("post/")
    public Contrat Create(@RequestBody Contrat contrat)
    {
        return contratService.Create(contrat);
    }
    @GetMapping("/get")
    public List<Contrat> Read()
    {
        return contratService.Read();
    }

    @PutMapping("/put/{ID}")
    public Contrat update(@PathVariable int ID,@RequestBody Contrat contrat)
    {
        return contratService.Update(ID,contrat);
    }

    @DeleteMapping("/delete/{ID}")
    public String delete(@PathVariable int ID)
    {
        return contratService.Delete(ID);
    }
}
