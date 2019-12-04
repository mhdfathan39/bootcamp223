package com.xsis.bootcamp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.xsis.bootcamp.model.Regions;
import com.xsis.bootcamp.model.Countries;
import com.xsis.bootcamp.services.RegionsService;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	private RegionsService regionsService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {

			List<Regions> listOfUser = Arrays.asList(
				new Regions("South East", new Countries("T1", "TSONE"),
							new Countries("T2", "TS-2"))
				
			);

			regionsService.saveAll(listOfUser);
			
			

		};
	}

}
