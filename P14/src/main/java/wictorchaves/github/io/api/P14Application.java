package wictorchaves.github.io.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import wictorchaves.github.io.api.utils.SenhaUtils;

@SpringBootApplication
public class P14Application {

	public static void main(String[] args) {
		SpringApplication.run(P14Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String senha = "123456";
			
			String senhaEncoded = SenhaUtils.gerarBCrypt(senha);
			System.out.println("Senha encoded: " + senhaEncoded);
			
			senhaEncoded = SenhaUtils.gerarBCrypt(senha);
			System.out.println("Senha encoded novamente: " + senhaEncoded);
			
			System.out.println("Senha válida: " + SenhaUtils.senhaValida(senha, senhaEncoded));
		};
	}

}
