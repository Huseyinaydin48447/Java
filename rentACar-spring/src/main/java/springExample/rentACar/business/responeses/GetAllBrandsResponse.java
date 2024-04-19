package springExample.rentACar.business.responeses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {
	//istediğini listelemek için response kullanır
	
	private int id;
	private String name;

}
