package app.trybe.specialityapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringBootConfiguration
public class SpecialityAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpecialityAppApplication.class, args);
		System.out.println("starting aplication");
	}

}
