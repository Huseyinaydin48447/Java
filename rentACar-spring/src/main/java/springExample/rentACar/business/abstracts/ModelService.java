package springExample.rentACar.business.abstracts;

import java.util.List;

import springExample.rentACar.business.requests.CreateModelRequest;
import springExample.rentACar.business.responeses.GetAllModelsResponse;
import springExample.rentACar.business.responeses.GetByIdBrandsResponse;
import springExample.rentACar.business.responeses.GetByIdModelsResponse;


public interface ModelService {
	
	
	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest);
	GetByIdModelsResponse getById(int id);


}
