package tn.esprit.testspring.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspring.entity.Apprenant;
import tn.esprit.testspring.entity.Formation;

public interface IFormationRepository extends JpaRepository<Formation, Integer> {
}
