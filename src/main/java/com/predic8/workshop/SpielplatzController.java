package com.predic8.workshop;

import com.predic8.workshop.repository.SpielplatzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@RestController
public class SpielplatzController {
	@Autowired
	private SpielplatzRepository spielplatzRepository;
	@Autowired
	private LikesServiceClient likesServiceClient;

	@RequestMapping(method = GET, value = "/spielplatz/{id}")
	public int getSpielPlatz(@PathVariable("id") Long id) {

		return likesServiceClient.getLikes(1L);
	}
}
