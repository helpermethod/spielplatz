package com.predic8.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpielplatzApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpielplatzApplication.class, args);
	}
}