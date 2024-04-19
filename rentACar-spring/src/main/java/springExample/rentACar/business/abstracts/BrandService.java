package springExample.rentACar.business.abstracts;

import java.util.List;

import springExample.rentACar.business.requests.CreateBrandRequest;
import springExample.rentACar.business.requests.UpdateBrandRequest;
import springExample.rentACar.business.responeses.GetAllBrandsResponse;
import springExample.rentACar.business.responeses.GetByIdBrandsResponse;
public interface BrandService {

//	List<Brand> getAll();
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandsResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);
}
