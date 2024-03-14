package springExample.rentACar.entities.concreters;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="models")
@AllArgsConstructor
@NoArgsConstructor 
@Getter
@Setter
@Entity
public class Model {

	@Id
	@Column(name="id") 
	@GeneratedValue(strategy=GenerationType.IDENTITY)// veritabanın primary key olduğunu belirtmek
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="brand_id")//  Brand.java daki brand id bağlantı kurmak
	private Brand brand;// burdaki brand @OneToMany içinde kullancak
	
	@OneToMany(mappedBy = "model")
	private List<Car> cars;// birden fazla car olduğunu belirtmek 
}
