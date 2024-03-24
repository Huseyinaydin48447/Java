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
import springExample.rentACar.business.abstracts.BrandService;
import springExample.rentACar.business.requests.CreateBrandRequest;
import springExample.rentACar.business.responeses.GetAllBrandsResponse;
import springExample.rentACar.business.responeses.GetByIdBrandsResponse;
import springExample.rentACar.dataAccess.abstracts.BrandRepository;
import springExample.rentACar.entities.concreters.Brand;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
	private BrandService brandService;
	private BrandRepository brandRepository;
	
	@GetMapping()
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();
	}
	
	//@Valid() hatayı döndürme
	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@RequestBody @Valid()  CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
	
	@GetMapping("/{id}")
	public GetByIdBrandsResponse getById(@PathVariable  int id){
		return brandService.getById(id);
	}

	@PostMapping("/updateBrand")
	public ResponseEntity<?> updateBrand(@RequestBody Brand brand) {
	    brandRepository.save(brand);
	    
	    return ResponseEntity.ok(brand);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateBrand(@PathVariable int id, @RequestBody Brand brand) {
	    Brand existingBrand = brandRepository.findById(id).orElse(null);
	    if (existingBrand != null) {
	        existingBrand.setName(brand.getName());
	        brandRepository.save(existingBrand);
	        return ResponseEntity.ok(existingBrand);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	
	//swagger-ui/index.html

}
