package com.jbk.EProc.Vehicle.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.jbk")
@EnableSwagger2
public class EProcurementAuctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EProcurementAuctionApplication.class, args);
	}

} 
