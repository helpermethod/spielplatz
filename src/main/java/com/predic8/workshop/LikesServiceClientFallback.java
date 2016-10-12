package com.predic8.workshop;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@Component
public class LikesServiceClientFallback implements LikesServiceClient {
	@Override
	public int getLikes(@PathVariable("id") Long id) {
		return 0;
	}
}
