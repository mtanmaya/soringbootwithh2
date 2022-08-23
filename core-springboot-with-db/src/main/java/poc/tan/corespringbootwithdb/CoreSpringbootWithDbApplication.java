package poc.tan.corespringbootwithdb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreSpringbootWithDbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CoreSpringbootWithDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ran with command line runner of spring boot app");
	}
}
