package tn.esprit.testspring.service;

import tn.esprit.testspring.entity.Formateur;
import tn.esprit.testspring.entity.Formation;

public interface IFormationService {
    public void ajouterEtAffecterFormationAFormateur(Formation formation, Integer idFormateur);

    public Integer getRevenuByFormation(Integer idFormation);
}
