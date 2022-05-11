package com.Task.FlightApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com.TaskFlightApplication.Controller,com.TaskFlightApplication.Model,com.TaskFlightApplication.Service"})
//@EnableJpaRepositories("com.TaskFlightApplication.Repository")
public class FlightApplication  {

	public static void main(String[] args) {
		SpringApplication.run(FlightApplication.class, args);
	}


}