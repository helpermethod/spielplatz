package com.predic8.workshop;

import com.predic8.workshop.domain.Spielplatz;
import com.predic8.workshop.repository.SpielplatzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private SpielplatzRepository spielplatzRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		spielplatzRepository.save(new Spielplatz("Bad Godesberg"));
	}
}