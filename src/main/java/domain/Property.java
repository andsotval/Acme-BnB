
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Property extends DomainEntity {

	//Attributes
	private String					name;
	private double					rate;
	private String					description;
	private String					address;
	private Collection<Attribute>	attributes;


	//Constructor
	public Property() {
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
	@Min(0)
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	@NotBlank
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@NotBlank
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@ElementCollection
	@Valid
	public Collection<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(Collection<Attribute> attributes) {
		this.attributes = attributes;
	}


	//Relationships
	private Lessor				lessor;
	private Collection<Audit>	audits;
	private Collection<Cache>	caches;


	@NotNull
	@Valid
	@ManyToOne()
	public Lessor getLessor() {
		return lessor;
	}

	public void setLessor(Lessor lessor) {
		this.lessor = lessor;
	}

	@NotNull
	@Valid
	@OneToMany(mappedBy = "property")
	public Collection<Audit> getAudits() {
		return audits;
	}

	public void setAudits(Collection<Audit> audits) {
		this.audits = audits;
	}
	@NotNull
	@Valid
	@ManyToMany()
	public Collection<Cache> getCaches() {
		return caches;
	}

	public void setCaches(Collection<Cache> caches) {
		this.caches = caches;
	}

}
