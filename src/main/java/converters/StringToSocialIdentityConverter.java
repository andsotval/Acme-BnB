package converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import repositories.ActorRepository;
import domain.Actor;
import domain.SocialIdentity;

@Component
@Transactional
public class StringToSocialIdentityConverter implements Converter<String, SocialIdentity>{
	@Autowired
	ActorRepository actorRepository;

	@Override
	public SocialIdentity convert(String text) {
		SocialIdentity result = new SocialIdentity();
		try {
			if(StringUtils.isEmpty(text))
				result=null;
			else{
				Actor actor= actorRepository.actorByNick(text);
				Assert.notNull(actor);
				result = actor.getSocialIdentity();
			}
		}  catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}
