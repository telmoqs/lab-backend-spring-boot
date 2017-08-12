package br.ufg.poswebmobile.labbackendspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/lab")
public class LabBackendSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabBackendSpringBootApplication.class, args);
	}
}
