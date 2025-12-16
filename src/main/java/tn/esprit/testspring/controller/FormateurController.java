package tn.esprit.testspring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspring.entity.Formateur;
import tn.esprit.testspring.service.IFormateurService;

import java.util.Date;

@RestController
@RequestMapping("/formateur")
public class FormateurController {

    @Autowired
    IFormateurService iFormateurService;

    @PostMapping("/add")
    public void addFormateur(@RequestBody Formateur f) {
        iFormateurService.ajouterFormateur(f);
    }

    @GetMapping("/remuneration/{id}/{d1}/{d2}")
    public Integer remuneration(@PathVariable Integer id,
                                @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date d1,
                                @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date d2) {
        return iFormateurService.getFormateurRemunerationByDate(id, d1, d2);
    }

}
