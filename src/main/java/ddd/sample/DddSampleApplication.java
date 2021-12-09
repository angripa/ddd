package ddd.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DddSampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(DddSampleApplication.class,args);

	}

	@Autowired
	public ConfigurableApplicationContext context;
}
