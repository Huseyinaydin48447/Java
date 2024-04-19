package springExample.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import springExample.rentACar.business.requests.UpdateBrandRequest;
import springExample.rentACar.business.responeses.GetAllBrandsResponse;
import springExample.rentACar.business.responeses.GetByIdBrandsResponse;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
	private BrandService brandService;

//	@Autowired // bunun:BrandService  otomatik bakıp  yapıyor
//	public BrandsController(BrandService brandService) {
//		this.brandService = brandService;
//	}
	
//	@GetMapping("/getall")
//	public List<Brand> getAll(){
//		return brandService.getAll();
//	} 
	
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
	
	@PutMapping
	public void update(UpdateBrandRequest updateBrandRequest) {
		this.brandService.update(updateBrandRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.brandService.delete(id);
	}
	
	
	
	
	//swagger-ui/index.html

}
