package com.yiado;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FantasyRestApplication implements CommandLineRunner {
	
	private static Logger logger = LoggerFactory.getLogger(FantasyRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FantasyRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Fantasy Team Pro Runn...");
	}

}
