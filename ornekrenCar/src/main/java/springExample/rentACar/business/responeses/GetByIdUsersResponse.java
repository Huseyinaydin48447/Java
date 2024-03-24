package springExample.rentACar.business.responeses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdUsersResponse {
	private int id;
	private String username;
	private String password;
	private String role;
}
