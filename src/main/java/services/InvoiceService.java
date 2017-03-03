package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Invoice;

import repositories.InvoiceRepository;

@Service
@Transactional
public class InvoiceService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private InvoiceRepository invoiceRepository;

	// Supporting services ----------------------------------------------------

	// Constructors -----------------------------------------------------------

	public InvoiceService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------
	public Invoice create(){
		Invoice res= new Invoice();
		return res;
	}
	
	public Collection<Invoice> findAll() {
		Collection<Invoice> result;
		
		result = invoiceRepository.findAll();
		Assert.notNull(result);
		
		return result;
	}

	public Invoice findOne(int invoiceId) {
		Assert.isTrue(invoiceId != 0);
		
		Invoice result;

		result = invoiceRepository.findOne(invoiceId);
		Assert.notNull(result);

		return result;
	}
	
	public Invoice save(Invoice invoice) {
		Assert.notNull(invoice);
		
		Invoice result;

		result = invoiceRepository.save(invoice);
		
		return result;
	}	
	
	public void delete(Invoice invoice) {
		Assert.notNull(invoice);
		Assert.isTrue(invoice.getId() != 0);
		Assert.isTrue(invoiceRepository.exists(invoice.getId()));		
		
		invoiceRepository.delete(invoice);
	}

	// Other business methods -------------------------------------------------
}
