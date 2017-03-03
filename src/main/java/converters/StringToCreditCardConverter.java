package converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import repositories.SponsorRepository;

import domain.CreditCard;
import domain.Sponsor;

@Component
@Transactional
public class StringToCreditCardConverter implements Converter<String, CreditCard>{

	@Autowired
	SponsorRepository sponsorRepository;

	@Override
	public CreditCard convert(String text) {
		CreditCard result = new CreditCard();
		try {
			if(StringUtils.isEmpty(text))
				result=null;
			else{
				String[] aux = text.split(",");
				Sponsor sponsor= sponsorRepository.sponsorByCreditCard(aux[0], aux[1]);
			Assert.notNull(sponsor);
			result = sponsor.getCreditCard();
			}
		}  catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}
}
