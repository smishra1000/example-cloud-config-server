package com.sameer.fullstack;

import jdk.management.resource.ResourceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication

@RestController
@RequestMapping("accounts-service")
public class AccountsServiceApplication {
	@GetMapping("/getAllAccountsUpdated")

	public List<String> getAccounts() {
		return Stream.of("bank","facebook").collect(Collectors.toList());

	}

	public static void main(String[] args) {
		SpringApplication.run(AccountsServiceApplication.class, args);
	}

}
