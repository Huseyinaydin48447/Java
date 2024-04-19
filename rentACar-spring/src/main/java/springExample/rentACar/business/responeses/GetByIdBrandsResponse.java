package springExample.rentACar.business.responeses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdBrandsResponse {
	// id göre getirme
	private int id;
	private String name;
}
