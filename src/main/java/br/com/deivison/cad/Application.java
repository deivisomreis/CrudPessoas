package br.com.deivison.cad;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@Slf4j
public class Application {

	public static void main(String[] args) {
		log.info("** inciando o projeto com Lombok **");
		
		SpringApplication.run(Application.class, args);
		
		log.info("** projeto inciado com Lombok **");
	}

}
