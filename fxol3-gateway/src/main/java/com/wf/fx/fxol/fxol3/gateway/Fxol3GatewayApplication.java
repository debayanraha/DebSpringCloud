package com.wf.fx.fxol.fxol3.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Fxol3GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fxol3GatewayApplication.class, args);
	}

}
