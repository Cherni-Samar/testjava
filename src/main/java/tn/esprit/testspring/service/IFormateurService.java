package tn.esprit.testspring.service;

import tn.esprit.testspring.entity.Formateur;

import java.util.Date;

public interface IFormateurService {
    public void ajouterFormateur(Formateur f);
    public Integer getFormateurRemunerationByDate(Integer idFormateur, Date d1, Date d2);


}
