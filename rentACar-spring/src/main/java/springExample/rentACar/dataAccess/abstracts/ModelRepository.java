package springExample.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import springExample.rentACar.entities.concreters.Model;

public interface ModelRepository  extends JpaRepository<Model, Integer> {
	
	
	boolean existsByName(String name);
}
 