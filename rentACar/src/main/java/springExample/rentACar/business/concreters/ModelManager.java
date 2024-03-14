package springExample.rentACar.business.concreters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import springExample.rentACar.business.abstracts.ModelService;
import springExample.rentACar.business.requests.CreateModelRequest;
import springExample.rentACar.business.responeses.GetAllModelsResponse;
import springExample.rentACar.core.utilities.mappers.ModelMapperService;
import springExample.rentACar.dataAccess.abstracts.ModelRepository;
import springExample.rentACar.entities.concreters.Model;
@Service
@AllArgsConstructor//1
public class ModelManager  implements ModelService {

	private ModelRepository modelRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllModelsResponse> getAll() {
		
		List<Model> models=modelRepository.findAll();

		List<GetAllModelsResponse> modelsResponses=models.stream()
				.map(model ->this.modelMapperService.forResponse()
						.map(model, GetAllModelsResponse.class)).collect(Collectors.toList());
		return modelsResponses;
	}

	@Override
	public void add(CreateModelRequest createModelRequest) {
		Model model =this.modelMapperService.forRequest().map(createModelRequest, Model.class);
		
		this.modelRepository.save(model);		
	}

}
