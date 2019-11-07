package wictorchaves.github.io.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import wictorchaves.github.io.api.services.ExemploService;

@SpringBootApplication
public class P19Application {
	
	@Autowired
	private ExemploService exemploService;

	public static void main(String[] args) {
		SpringApplication.run(P19Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			this.exemploService.testarServico();
		};
	}

}
