package tn.esprit.testspring.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspring.entity.Apprenant;

public interface IApprenantRepository extends JpaRepository<Apprenant, Integer> {
}
