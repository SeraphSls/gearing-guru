package br.com.gearing.guru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.gearing.guru", "br.com.gearing.guru.infrastructure.jwt.config" , "br.com.gearing.guru.adapters.repository"})
public class GearingGuruApplication {

	public static void main(String[] args) {
		SpringApplication.run(GearingGuruApplication.class, args);
	}

}
