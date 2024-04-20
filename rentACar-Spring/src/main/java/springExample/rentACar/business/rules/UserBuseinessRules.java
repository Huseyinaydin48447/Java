package springExample.rentACar.business.rules;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import springExample.rentACar.core.utilities.exceptions.BusinessException;
import springExample.rentACar.dataAccess.abstracts.UserRepository;
@AllArgsConstructor
@Service
public class UserBuseinessRules {
	private UserRepository userRepository;
	
	// bir den fazla aynı model var ise
	public void checkIfUserNameExists(String username) {
		if(this.userRepository.existsByUsername(username)) {
			throw new BusinessException("Brand already exists");
			 
		 }
		
	}
}

