package projeto.SergipeTech.GerenciadorVeiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "projeto.SergipeTech.GerenciadorVeiculos.Repository")
public class GerenciadorVeiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorVeiculosApplication.class, args);
	}

}
