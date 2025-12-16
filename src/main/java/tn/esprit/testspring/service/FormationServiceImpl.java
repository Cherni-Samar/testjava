package tn.esprit.testspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.testspring.entity.Apprenant;
import tn.esprit.testspring.entity.Formateur;
import tn.esprit.testspring.entity.Formation;
import tn.esprit.testspring.respository.IApprenantRepository;
import tn.esprit.testspring.respository.IFormateurRepository;
import tn.esprit.testspring.respository.IFormationRepository;

@Service
public class FormationServiceImpl implements IFormationService {

    @Autowired
    IFormationRepository  formationRepository;

    @Autowired
    IFormateurRepository   formateurRepository;

    @Autowired
    IApprenantRepository apprenantRepository;


    @Override
    public void ajouterEtAffecterFormationAFormateur(Formation f, Integer idFormateur) {
        Formateur formateur = formateurRepository.findById(idFormateur).orElse(null);
        f.setFormateur(formateur);
        formationRepository.save(f);
    }

    @Override
    public Integer getRevenuByFormation(Integer idFormation) {
        Formation f = formationRepository.findById(idFormation).orElse(null);
        return f.getApprenants().size() * f.getFrais();
    }


}