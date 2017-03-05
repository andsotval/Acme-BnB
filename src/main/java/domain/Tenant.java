
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class Tenant extends Actor {

	//Attributes
	private Collection<Comment>	comments;


	//Constructor
	public Tenant() {
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


	//Relationships
	private Finder				finder;
	private Collection<Invoice>	invoices;
	private Collection<Book>	books;


	@NotNull
	@Valid
	@OneToOne()
	public Finder getFinder() {
		return finder;
	}

	public void setFinder(Finder finder) {
		this.finder = finder;
	}
	@NotNull
	@Valid
	@OneToMany(mappedBy = "tenant")
	public Collection<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(Collection<Invoice> invoices) {
		this.invoices = invoices;
	}
	@NotNull
	@Valid
	@OneToMany(mappedBy = "tenant")
	public Collection<Book> getBooks() {
		return books;
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}
}
