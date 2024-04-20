package springExample.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import springExample.rentACar.entities.concreters.User;
public interface UserRepository extends JpaRepository<User, Integer> {
	
	 User findByUsername(String username);
	 boolean existsByUsername(String username);
}
