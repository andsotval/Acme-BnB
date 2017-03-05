
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class AttributeName extends DomainEntity {

	//Attributes
	private String	name;


	//Constructor
	public AttributeName() {
		super();
	}
	//Getters and Setters
	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//Relationships
}
