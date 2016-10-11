package com.predic8.workshop.tests;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
public class GreetingComponentTests {
	@Test
	public void itShouldReturnAGreetingWhenCalledWithAName() {
		GreetingService greetingService = mock(GreetingService.class);
		given(greetingService.greet("Oliver")).willReturn("Hello Oliver");

		assertThat(new GreetingComponent(greetingService).greet("Oliver")).isEqualTo("Hello Oliver");
	}
}