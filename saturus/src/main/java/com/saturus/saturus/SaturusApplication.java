package com.saturus.saturus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EntityScan
public class SaturusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaturusApplication.class, args);
	}

}
