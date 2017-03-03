
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.PROPERTY)
public class SocialIdentity {

	//Attributes
	private String	nick;
	private String	nameSocial;
	private String	url;


	//Constructor
	public SocialIdentity() {
		super();
	}

	//Getters and Setters
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNameSocial() {
		return nameSocial;
	}

	public void setNameSocial(String nameSocial) {
		this.nameSocial = nameSocial;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
