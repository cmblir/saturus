package com.saturus.saturus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SaturusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaturusApplication.class, args);
	}

}
