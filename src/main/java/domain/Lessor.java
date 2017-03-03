
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Lessor extends Actor {

	//Attributes

	//Constructor
	public Lessor() {
		super();
	}

	//Getters and Setters
}
