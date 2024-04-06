package com.wf.fx.fxol.fxol3.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Fxol3TemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fxol3TemplateApplication.class, args);
	}

}
