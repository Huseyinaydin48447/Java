package springExample.rentACar.business.responeses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllModelsResponse {
	// yeni bir sütün eklemek için sadece buraya eklemek yeterli
	private int id;
	private String name;
	private String brand_id;

	
}
