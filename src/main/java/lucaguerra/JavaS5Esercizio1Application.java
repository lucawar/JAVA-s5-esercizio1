package lucaguerra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class JavaS5Esercizio1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaS5Esercizio1Application.class, args);

		log.info("----Esercizio 1----");
		log.info("Forza Roma");

	}

}
