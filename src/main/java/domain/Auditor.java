
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Auditor extends Actor {

	//Attributes
	private String	nameCompany;


	//Constructor
	public Auditor() {
		super();
	}

	//Getters and Setters
	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

}
