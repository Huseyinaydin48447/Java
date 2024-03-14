package springExample.rentACar.entities.concreters;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
//@Data 
@AllArgsConstructor
@NoArgsConstructor 
@Getter
@Setter
@Entity
public class Brand {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name") 
	private String name;
	
	@OneToMany(mappedBy = "brand")//private Brand brand;// burdaki brand @OneToMany içinde kullancak
	private List<Model> models;

}
