package com.hashedin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsAutomationApplication.class, args);
	}

	@GetMapping ("/my")
	public String message() {
		return "Welcome to the my world!";
	}
}
