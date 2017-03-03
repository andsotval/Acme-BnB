
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Tenant extends Actor {

	//Attributes

	//Constructor
	public Tenant() {
		super();
	}

	//Getters and Setters
}
