
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Book extends DomainEntity {

	//Attributes
	private Date		checkIn;
	private Date		checkOut;
	private boolean		isSmoker;
	private CreditCard	creditCard;
	private Request		request;


	//Constructor
	public Book() {
		super();
	}

	//Getters and Setters	
	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public boolean isSmoker() {
		return isSmoker;
	}

	public void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

}
