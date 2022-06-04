package idat.pe.ConfigServerPruena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerPruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerPruebaApplication.class, args);
	}

}
