package springExample.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import springExample.rentACar.entities.concreters.Brand;


public interface BrandRepository extends JpaRepository<Brand,Integer>  {


	boolean existsByName(String name);
	
} 
