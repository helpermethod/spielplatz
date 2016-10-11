package com.predic8.workshop.tests;

import org.springframework.stereotype.Component;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@Component
public class GreetingComponent {
	private final GreetingService greetingService;

	public GreetingComponent(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String greet(String name) {
		return greetingService.greet(name);
	}
}
