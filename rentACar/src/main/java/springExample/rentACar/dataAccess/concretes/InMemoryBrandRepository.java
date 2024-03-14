//package springExample.rentACar.dataAccess.concretes;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import springExample.rentACar.dataAccess.abstracts.BrandRepository;
//import springExample.rentACar.entities.concreters.Brand;
//
//@Repository
//public class InMemoryBrandRepository implements BrandRepository {
//
//	List <Brand> brands;
//	
//	
//	public InMemoryBrandRepository() {
//		brands =new ArrayList<Brand>();// boş bir aray oluşuyor
//		brands.add(new Brand(1,"BMW"));
//		brands.add(new Brand(2,"AUİD"));
//	}
//
//
//	@Override
//	public List<Brand> getAll() {
//		// TODO Auto-generated method stub
//		return brands;
//	}
//
//}
