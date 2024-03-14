package springExample.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import springExample.rentACar.entities.concreters.Brand;


public interface BrandRepository extends JpaRepository<Brand,Integer>  {
//Repository veri tabanınna isimlerde kullanılır
//	void add();
//	void update();
//	List<Brand> getAll();// bunu siliyoruz çünkü onun yerini JpaRepositoy alır
//	

	boolean existsByName(String name);
	
} 
