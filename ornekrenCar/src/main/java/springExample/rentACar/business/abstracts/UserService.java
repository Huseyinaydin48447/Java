package springExample.rentACar.business.abstracts;

import java.util.List;

import springExample.rentACar.business.requests.CreateUserRequest;
import springExample.rentACar.business.responeses.GetAllUsersResponse;
import springExample.rentACar.business.responeses.GetByIdUsersResponse;

public interface UserService {
	List<GetAllUsersResponse> getAll();
	void add(CreateUserRequest createUserRequest);
	GetByIdUsersResponse getById(int id);
}
