package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class DemoApplication {

	private final AtomicInteger counter = new AtomicInteger();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value= "name", defaultValue = "world") String name) {
		return new Greeting(counter.incrementAndGet(), String.format("Hello %s!", name));
	}
}