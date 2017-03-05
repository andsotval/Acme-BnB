
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

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
	@NotBlank
	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}


	//Relationships
	private Collection<Audit>	audits;


	@NotNull
	@Valid
	@OneToMany(mappedBy = "auditor")
	public Collection<Audit> getAudits() {
		return audits;
	}

	public void setAudits(Collection<Audit> audits) {
		this.audits = audits;
	}

}
