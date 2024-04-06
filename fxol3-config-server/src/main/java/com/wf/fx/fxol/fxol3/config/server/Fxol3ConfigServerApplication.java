package com.wf.fx.fxol.fxol3.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Fxol3ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fxol3ConfigServerApplication.class, args);
	}

}
