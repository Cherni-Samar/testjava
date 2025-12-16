package tn.esprit.testspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.testspring.entity.Apprenant;
import tn.esprit.testspring.entity.Formateur;
import tn.esprit.testspring.entity.Formation;
import tn.esprit.testspring.respository.IApprenantRepository;
import tn.esprit.testspring.respository.IFormateurRepository;
import tn.esprit.testspring.respository.IFormationRepository;

@Service
public class ApprenantServiceImpl implements IApprenantService {

    @Autowired
    private IApprenantRepository apprenantRepository;

    @Autowired
    IFormationRepository formationRepository;

    @Autowired
    IFormateurRepository   formateurRepository;


    @Override
    public void ajouterApprenant(Apprenant apprenant) {
        apprenantRepository.save(apprenant);
        System.out.println("apprenant added succesfully");
    }

    @Override
    public void affecterApprenantFormation(Integer idApprenant, Integer idFormation) {
        Formation formation = formationRepository.findById(idFormation).orElse(null);
        Apprenant apprenant = apprenantRepository.findById(idApprenant).orElse(null);

        if (formation.getApprenants().size() < formation.getNbrMaxParticipants()) {
            //apprenant.setFormations(formation);
            apprenantRepository.save(apprenant);
        }
    }

    @Override
    @Scheduled(fixedRate = 30000)
    public void getNbrApprenantByFormation() {
        formationRepository.findAll().forEach(f ->
                System.out.println("Formation " + f.getTitre() +
                        " : " + f.getApprenants().size() + " apprenants")
        );
    }

}
