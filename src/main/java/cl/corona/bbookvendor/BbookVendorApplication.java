package cl.corona.bbookvendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BbookVendorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbookVendorApplication.class, args);
	}

}
