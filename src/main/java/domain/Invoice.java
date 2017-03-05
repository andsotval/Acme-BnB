
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

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
	@Past
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}
	@NotNull
	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}
	@NotBlank
	public String getInformationTenant() {
		return informationTenant;
	}

	public void setInformationTenant(String informationTenant) {
		this.informationTenant = informationTenant;
	}
	@NotBlank
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	@Min(0)
	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Valid
	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	//Relationships
	private Tenant	tenant;


	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
}
