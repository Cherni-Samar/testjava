package tn.esprit.testspring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspring.entity.Formation;
import tn.esprit.testspring.service.IFormationService;

@RestController
@RequestMapping("/formation")
public class FormationController {

    @Autowired
    IFormationService formationService;


    @PostMapping("/addFormation/{idFormateur}")
    public void ajouterFormation(@RequestBody Formation f,
                                 @PathVariable Integer idFormateur) {
        formationService.ajouterEtAffecterFormationAFormateur(f, idFormateur);
    }


    @GetMapping("/revenu/{idFormation}")
    public Integer revenu(@PathVariable Integer idFormation) {
        return formationService.getRevenuByFormation(idFormation);
    }
}
