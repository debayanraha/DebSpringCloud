package com.wf.fx.fxol.fxol3.hystrix.dash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Fxol3HystrixDashApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fxol3HystrixDashApplication.class, args);
	}

}
