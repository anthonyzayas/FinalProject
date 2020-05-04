package io.zayas.noteTaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="io.zayas.noteTaker")
public class NoteTakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteTakerApplication.class, args);
	}

}
