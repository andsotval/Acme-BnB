package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class Fee extends DomainEntity{
	//Attributes
	private double fee;
	//Constructor
	public Fee(){
		super();
	}
	//Getters and Setters
	@NotNull
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	//Relationships

}
