package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Tenant;

import repositories.TenantRepository;

@Service
@Transactional
public class TenantService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private TenantRepository tenantRepository;

	// Supporting services ----------------------------------------------------

	// Constructors -----------------------------------------------------------

	public TenantService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------
	public Tenant create(){
		Tenant res= new Tenant();
		return res;
	}
	
	public Collection<Tenant> findAll() {
		Collection<Tenant> result;
		
		result = tenantRepository.findAll();
		Assert.notNull(result);
		
		return result;
	}

	public Tenant findOne(int tenantId) {
		Assert.isTrue(tenantId != 0);
		
		Tenant result;

		result = tenantRepository.findOne(tenantId);
		Assert.notNull(result);

		return result;
	}
	
	public Tenant save(Tenant tenant) {
		Assert.notNull(tenant);
		
		Tenant result;

		result = tenantRepository.save(tenant);
		
		return result;
	}	
	
	public void delete(Tenant tenant) {
		Assert.notNull(tenant);
		Assert.isTrue(tenant.getId() != 0);
		Assert.isTrue(tenantRepository.exists(tenant.getId()));		
		
		tenantRepository.delete(tenant);
	}

	// Other business methods -------------------------------------------------
}
