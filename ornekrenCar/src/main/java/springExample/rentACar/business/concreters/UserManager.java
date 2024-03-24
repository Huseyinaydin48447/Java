package springExample.rentACar.business.concreters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import springExample.rentACar.business.abstracts.UserService;
import springExample.rentACar.business.requests.CreateUserRequest;
import springExample.rentACar.business.responeses.GetAllBrandsResponse;
import springExample.rentACar.business.responeses.GetAllUsersResponse;
import springExample.rentACar.business.responeses.GetByIdUsersResponse;
import springExample.rentACar.business.rules.BrandBusinessRules;
import springExample.rentACar.business.rules.UserBuseinessRules;
import springExample.rentACar.core.utilities.mappers.ModelMapperService;
import springExample.rentACar.dataAccess.abstracts.BrandRepository;
import springExample.rentACar.dataAccess.abstracts.UserRepository;
import springExample.rentACar.entities.concreters.Brand;
import springExample.rentACar.entities.concreters.User;
@Service
@AllArgsConstructor//1
public class UserManager implements UserService {
	private ModelMapperService modelMapperService;
	private UserBuseinessRules userBuseinessRules;
	private UserRepository userRepository;
	


	
	@Override
	public List<GetAllUsersResponse> getAll() {
		List<User> users=userRepository.findAll();
		List<GetAllUsersResponse> usersResponses=users.stream()
				.map(user->this.modelMapperService.forResponse().map(user, GetAllUsersResponse.class))
				.collect(Collectors.toList());
	
		return usersResponses;
	}

	@Override
	public void add(CreateUserRequest createUserRequest) {
		
this.userBuseinessRules.checkIfUserNameExists(createUserRequest.getUsername());// hatayı döndüren

		
		User user =this.modelMapperService.forRequest().map(createUserRequest, User.class);
		
		this.userRepository.save(user);
		
		
		// TODO Auto-generated method stub

	}

	
	@Override
	public GetByIdUsersResponse getById(int id) {
		// TODO Auto-generated method stub
		User user =this.userRepository.findById(id).orElseThrow();
		
		GetByIdUsersResponse response=this.modelMapperService
				.forResponse().map(user, GetByIdUsersResponse.class);
		return response;
	}
	

	
	
	
	
	
	
	
	
	
	

}
