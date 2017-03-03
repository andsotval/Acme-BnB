
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Audit extends DomainEntity {

	//Attributes
	private Date	moment;
	private String	text;
	private int		numberAttachments;


	//Constructor
	public Audit() {
		super();
	}

	//Getters and Setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumberAttachments() {
		return numberAttachments;
	}

	public void setNumberAttachments(int numberAttachments) {
		this.numberAttachments = numberAttachments;
	}

}
