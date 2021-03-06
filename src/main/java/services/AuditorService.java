package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Auditor;

import repositories.AuditorRepository;

@Service
@Transactional
public class AuditorService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private AuditorRepository auditorRepository;

	// Supporting services ----------------------------------------------------

	// Constructors -----------------------------------------------------------

	public AuditorService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------
	public Auditor create(){
		Auditor res= new Auditor();
		return res;
	}
	
	public Collection<Auditor> findAll() {
		Collection<Auditor> result;
		
		result = auditorRepository.findAll();
		Assert.notNull(result);
		
		return result;
	}

	public Auditor findOne(int auditorId) {
		Assert.isTrue(auditorId != 0);
		
		Auditor result;

		result = auditorRepository.findOne(auditorId);
		Assert.notNull(result);

		return result;
	}
	
	public Auditor save(Auditor auditor) {
		Assert.notNull(auditor);
		
		Auditor result;

		result = auditorRepository.save(auditor);
		
		return result;
	}	
	
	public void delete(Auditor auditor) {
		Assert.notNull(auditor);
		Assert.isTrue(auditor.getId() != 0);
		Assert.isTrue(auditorRepository.exists(auditor.getId()));		
		
		auditorRepository.delete(auditor);
	}

	// Other business methods -------------------------------------------------
}
