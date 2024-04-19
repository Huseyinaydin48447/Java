package springExample.rentACar.business.rules;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import springExample.rentACar.core.utilities.exceptions.BusinessException;
import springExample.rentACar.dataAccess.abstracts.BrandRepository;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
	
	private BrandRepository brandRepository;
	
	// bir den fazla aynı model var ise
	public void checkIfBrandNameExists(String name) {
		if(this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand already exists");
			
		}
		
	}

}
