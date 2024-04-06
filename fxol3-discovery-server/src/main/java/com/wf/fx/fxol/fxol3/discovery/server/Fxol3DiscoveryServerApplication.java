package com.wf.fx.fxol.fxol3.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Fxol3DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fxol3DiscoveryServerApplication.class, args);
	}

}
