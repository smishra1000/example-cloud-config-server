package com.sameer.fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AccountsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsConfigServerApplication.class, args);
	}

}
