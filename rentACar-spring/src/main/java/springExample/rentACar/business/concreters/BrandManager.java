package springExample.rentACar.business.concreters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import springExample.rentACar.business.abstracts.BrandService;
import springExample.rentACar.business.requests.CreateBrandRequest;
import springExample.rentACar.business.requests.UpdateBrandRequest;
import springExample.rentACar.business.responeses.GetAllBrandsResponse;
import springExample.rentACar.business.responeses.GetByIdBrandsResponse;
import springExample.rentACar.business.rules.BrandBusinessRules;
import springExample.rentACar.core.utilities.mappers.ModelMapperService;
import springExample.rentACar.dataAccess.abstracts.BrandRepository;
import springExample.rentACar.entities.concreters.Brand;

@Service
@AllArgsConstructor//1
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;
	private BrandBusinessRules brandBusinessRules;


	public List<GetAllBrandsResponse> getAll() {

		
		List<Brand>  brands=  brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse= brands.stream()
				.map(brand->this.modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class))
				.collect(Collectors.toList());
		
	 return brandsResponse;
	}


	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		
//		Brand brand=new Brand();
//		brand.setName(createBrandRequest.getName());
		
		this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());// hatayı döndüren

		
		Brand brand =this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		
		this.brandRepository.save(brand);

	
	}


	@Override
	public GetByIdBrandsResponse getById(int id) {
		
		Brand brand =this.brandRepository.findById(id).orElseThrow();
		
		GetByIdBrandsResponse response=this.modelMapperService
				.forResponse().map(brand, GetByIdBrandsResponse.class);
		
				return response;
	}


	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand =this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandRepository.save(brand);
	}


	@Override
	public void delete(int id) {
		
		this.brandRepository.deleteById(id);
		
	}

}
