
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.NotBlank;

@Embeddable
@Access(AccessType.PROPERTY)
public class Attribute {

	//Attributes
	private String	name;
	private String	value;


	//Constructor
	public Attribute() {
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
	@NotBlank
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	//Relationships
}
