
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Invoice extends DomainEntity {

	//Attributes
	private Date		moment;
	private int			vat;
	private String		informationTenant;
	private String		details;
	private double		totalAmount;
	private CreditCard	creditCard;


	//Constructor
	public Invoice() {
		super();
	}

	//Getters and Setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public String getInformationTenant() {
		return informationTenant;
	}

	public void setInformationTenant(String informationTenant) {
		this.informationTenant = informationTenant;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
