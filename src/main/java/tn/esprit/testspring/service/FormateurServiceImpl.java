package tn.esprit.testspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.testspring.entity.Formateur;
import tn.esprit.testspring.respository.IFormateurRepository;

import java.util.Date;

@Service
public class FormateurServiceImpl implements IFormateurService {

    @Autowired
    private IFormateurRepository formateurRepository;

    @Override
    public void ajouterFormateur(Formateur f) {
        formateurRepository.save(f);
        System.out.println("formateur added succesfully");
    }

    public Integer getFormateurRemunerationByDate(Integer idFormateur, Date d1, Date d2) {
        Formateur f = formateurRepository.findById(idFormateur).orElse(null);

        return f.getFormations().stream()
                .filter(form -> !form.getDateDebut().before(d1) && !form.getDateFin().after(d2))
                .mapToInt(form -> form.getNbrHeures() * f.getTarifHoraire())
                .sum();
    }

}
