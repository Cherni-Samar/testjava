package tn.esprit.testspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspring.entity.Apprenant;
import tn.esprit.testspring.entity.Formateur;
import tn.esprit.testspring.service.IApprenantService;
import tn.esprit.testspring.service.IFormateurService;

@RestController
@RequestMapping("/apprenant")
public class ApprenantController {

    @Autowired
    IApprenantService apprenantService;

    @PostMapping("/add")
    public void addApprenant(@RequestBody Apprenant apprenant) {
        apprenantService.ajouterApprenant(apprenant);
    }

    @PutMapping("/affecter/{idApprenant}/{idFormation}")
    public void affecter(@PathVariable Integer idApprenant,
                         @PathVariable Integer idFormation) {
        apprenantService.affecterApprenantFormation(idApprenant, idFormation);
    }

}
