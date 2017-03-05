
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class Lessor extends Actor {

	//Attributes
	private Collection<Comment>	comments;
	private CreditCard			creditCard;


	//Constructor
	public Lessor() {
		super();
	}
	//Getters and Setters
	@ElementCollection
	@Valid
	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	//Relationships
	private Collection<Property>	properties;


	@NotNull
	@Valid
	@OneToMany(mappedBy = "lessor")
	public Collection<Property> getProperties() {
		return properties;
	}

	public void setProperties(Collection<Property> properties) {
		this.properties = properties;
	}

}
