package br.com.alura.Livros;
import br.com.alura.Livros.Principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class LivrosApplication implements CommandLineRunner {
	@Autowired
	private Principal principal;

	public static void main(String[] args) {
		SpringApplication.run(LivrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		principal.exibeMenu();
	}
}
