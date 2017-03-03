package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Book;

import repositories.BookRepository;

@Service
@Transactional
public class BookService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private BookRepository bookRepository;

	// Supporting services ----------------------------------------------------

	// Constructors -----------------------------------------------------------

	public BookService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------
	public Book create(){
		Book res= new Book();
		return res;
	}
	
	public Collection<Book> findAll() {
		Collection<Book> result;
		
		result = bookRepository.findAll();
		Assert.notNull(result);
		
		return result;
	}

	public Book findOne(int bookId) {
		Assert.isTrue(bookId != 0);
		
		Book result;

		result = bookRepository.findOne(bookId);
		Assert.notNull(result);

		return result;
	}
	
	public Book save(Book book) {
		Assert.notNull(book);
		
		Book result;

		result = bookRepository.save(book);
		
		return result;
	}	
	
	public void delete(Book book) {
		Assert.notNull(book);
		Assert.isTrue(book.getId() != 0);
		Assert.isTrue(bookRepository.exists(book.getId()));		
		
		bookRepository.delete(book);
	}

	// Other business methods -------------------------------------------------
}
