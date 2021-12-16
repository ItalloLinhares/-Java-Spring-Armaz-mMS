package com.itallolinhares.eurekaserverarmazem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverarmazemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverarmazemApplication.class, args);
	}

}
