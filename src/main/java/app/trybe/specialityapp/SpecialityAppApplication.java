package app.trybe.specialityapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@Configuration
//@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"app.trybe.specialityapp"})
public class SpecialityAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpecialityAppApplication.class, args);
	}

}
