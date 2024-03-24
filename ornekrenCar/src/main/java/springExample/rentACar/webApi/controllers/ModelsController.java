package springExample.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import springExample.rentACar.business.abstracts.ModelService;
import springExample.rentACar.business.requests.CreateModelRequest;
import springExample.rentACar.business.responeses.GetAllModelsResponse;
import springExample.rentACar.business.responeses.GetByIdBrandsResponse;
import springExample.rentACar.business.responeses.GetByIdModelsResponse;
import springExample.rentACar.dataAccess.abstracts.ModelRepository;
import springExample.rentACar.entities.concreters.Brand;
import springExample.rentACar.entities.concreters.Model;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor 
public class ModelsController {
	private ModelService modelService;
	
	private ModelRepository modelRepository;
	
	@GetMapping()
	public List<GetAllModelsResponse> getAll(){
		return modelService.getAll();
	}
	
	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@RequestBody @Valid()  CreateModelRequest createBrandRequest) {
		this.modelService.add(createBrandRequest);
	}

	@GetMapping("/{id}")
	public GetByIdModelsResponse getById(@PathVariable  int id){
		return modelService.getById(id);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateModel(@PathVariable int id, @RequestBody Model model) {
	  
		Model existingModel = modelRepository.findById(id).orElse(null);
	    if (existingModel != null) {
	      
	        existingModel.setName(model.getName());
	    
	        modelRepository.save(existingModel);
	      
	        return ResponseEntity.ok(existingModel);
	    } else {
	        
	        return ResponseEntity.notFound().build();
	    }
	}
	
	
	
}
