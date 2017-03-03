package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Lessor;

import repositories.LessorRepository;

@Service
@Transactional
public class LessorService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private LessorRepository lessorRepository;

	// Supporting services ----------------------------------------------------

	// Constructors -----------------------------------------------------------

	public LessorService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------
	public Lessor create(){
		Lessor res= new Lessor();
		return res;
	}
	
	public Collection<Lessor> findAll() {
		Collection<Lessor> result;
		
		result = lessorRepository.findAll();
		Assert.notNull(result);
		
		return result;
	}

	public Lessor findOne(int lessorId) {
		Assert.isTrue(lessorId != 0);
		
		Lessor result;

		result = lessorRepository.findOne(lessorId);
		Assert.notNull(result);

		return result;
	}
	
	public Lessor save(Lessor lessor) {
		Assert.notNull(lessor);
		
		Lessor result;

		result = lessorRepository.save(lessor);
		
		return result;
	}	
	
	public void delete(Lessor lessor) {
		Assert.notNull(lessor);
		Assert.isTrue(lessor.getId() != 0);
		Assert.isTrue(lessorRepository.exists(lessor.getId()));		
		
		lessorRepository.delete(lessor);
	}

	// Other business methods -------------------------------------------------
}
