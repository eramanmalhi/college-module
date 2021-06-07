package edu.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CollegeModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeModuleApplication.class, args);
	}

}
