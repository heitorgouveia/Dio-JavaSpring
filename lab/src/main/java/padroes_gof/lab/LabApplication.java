package padroes_gof.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*	*Projeto springboot
	*Utilizando os seguintes módulos:
	*- Spring Data JPA
	*- Spring Web
	*- H2 database
	*- OpenFeign */

@EnableFeignClients
@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabApplication.class, args);
	}

}
