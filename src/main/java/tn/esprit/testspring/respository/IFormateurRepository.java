package tn.esprit.testspring.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspring.entity.Formateur;

public interface IFormateurRepository extends JpaRepository<Formateur, Integer> {
}
