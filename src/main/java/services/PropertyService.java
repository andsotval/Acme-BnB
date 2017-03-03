package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Property;

import repositories.PropertyRepository;

@Service
@Transactional
public class PropertyService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private PropertyRepository propertyRepository;

	// Supporting services ----------------------------------------------------

	// Constructors -----------------------------------------------------------

	public PropertyService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------
	public Property create() {
		Property res = new Property();
		return res;
	}

	public Collection<Property> findAll() {
		Collection<Property> result;

		result = propertyRepository.findAll();
		Assert.notNull(result);

		return result;
	}

	public Property findOne(int propertyId) {
		Assert.isTrue(propertyId != 0);

		Property result;

		result = propertyRepository.findOne(propertyId);
		Assert.notNull(result);

		return result;
	}

	public Property save(Property property) {
		Assert.notNull(property);

		Property result;

		result = propertyRepository.save(property);

		return result;
	}

	public void delete(Property property) {
		Assert.notNull(property);
		Assert.isTrue(property.getId() != 0);
		Assert.isTrue(propertyRepository.exists(property.getId()));

		propertyRepository.delete(property);
	}

	// Other business methods -------------------------------------------------
}
