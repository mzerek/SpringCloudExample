package com.mzerek.eureka.mzerek_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MzerekEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MzerekEurekaApplication.class, args);
	}

}
