package com.predic8.workshop.tests;

import org.springframework.stereotype.Service;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@Service
public class GreetingService {
	public String greet(String name) {
		return "Hello " + name;
	}
}
