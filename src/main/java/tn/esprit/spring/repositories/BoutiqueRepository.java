package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Boutique;
@Repository
public interface BoutiqueRepository extends CrudRepository<Boutique, Long> {

}
