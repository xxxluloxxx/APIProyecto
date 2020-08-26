package com.avalith;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * Iniar una aplicacion con spring boot
 */
@SpringBootApplication
public class ApiProyectoApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(ApiProyectoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub		
	}

}
