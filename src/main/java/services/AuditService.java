package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Audit;

import repositories.AuditRepository;

@Service
@Transactional
public class AuditService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private AuditRepository auditRepository;

	// Supporting services ----------------------------------------------------

	// Constructors -----------------------------------------------------------

	public AuditService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------
	public Audit create(){
		Audit res= new Audit();
		return res;
	}
	
	public Collection<Audit> findAll() {
		Collection<Audit> result;
		
		result = auditRepository.findAll();
		Assert.notNull(result);
		
		return result;
	}

	public Audit findOne(int auditId) {
		Assert.isTrue(auditId != 0);
		
		Audit result;

		result = auditRepository.findOne(auditId);
		Assert.notNull(result);

		return result;
	}
	
	public Audit save(Audit audit) {
		Assert.notNull(audit);
		
		Audit result;

		result = auditRepository.save(audit);
		
		return result;
	}	
	
	public void delete(Audit audit) {
		Assert.notNull(audit);
		Assert.isTrue(audit.getId() != 0);
		Assert.isTrue(auditRepository.exists(audit.getId()));		
		
		auditRepository.delete(audit);
	}

}
