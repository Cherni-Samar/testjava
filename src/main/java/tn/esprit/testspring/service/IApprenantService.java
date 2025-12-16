package tn.esprit.testspring.service;

import tn.esprit.testspring.entity.Apprenant;

public interface IApprenantService {
    public void ajouterApprenant (Apprenant apprenant);
    public void affecterApprenantFormation(Integer idApprenant, Integer idFormation) ;
    public void getNbrApprenantByFormation() ;

}
