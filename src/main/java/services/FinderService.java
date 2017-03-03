package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Finder;

import repositories.FinderRepository;

@Service
@Transactional
public class FinderService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private FinderRepository finderRepository;

	// Supporting services ----------------------------------------------------

	// Constructors -----------------------------------------------------------

	public FinderService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------
	public Finder create(){
		Finder res= new Finder();
		return res;
	}
	
	public Collection<Finder> findAll() {
		Collection<Finder> result;
		
		result = finderRepository.findAll();
		Assert.notNull(result);
		
		return result;
	}

	public Finder findOne(int finderId) {
		Assert.isTrue(finderId != 0);
		
		Finder result;

		result = finderRepository.findOne(finderId);
		Assert.notNull(result);

		return result;
	}
	
	public Finder save(Finder finder) {
		Assert.notNull(finder);
		
		Finder result;

		result = finderRepository.save(finder);
		
		return result;
	}	
	
	public void delete(Finder finder) {
		Assert.notNull(finder);
		Assert.isTrue(finder.getId() != 0);
		Assert.isTrue(finderRepository.exists(finder.getId()));		
		
		finderRepository.delete(finder);
	}

	// Other business methods -------------------------------------------------
}
