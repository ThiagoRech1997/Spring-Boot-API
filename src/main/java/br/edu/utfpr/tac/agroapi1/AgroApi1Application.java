package br.edu.utfpr.tac.agroapi1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class AgroApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(AgroApi1Application.class, args);
	}

	@GetMapping
	public String hellow () {
		return "Funcinando";
	}
}
