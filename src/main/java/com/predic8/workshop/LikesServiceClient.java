package com.predic8.workshop;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@FeignClient(name = "likes-service", fallback = LikesServiceClientFallback.class)
public interface LikesServiceClient {
	@RequestMapping(method = GET, value = "/likes/objects/{id}")
	int getLikes(@PathVariable("id") Long id);
}