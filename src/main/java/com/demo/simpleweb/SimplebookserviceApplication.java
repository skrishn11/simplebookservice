package com.demo.simpleweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.demo.simpleweb.model.Book;
import com.demo.simpleweb.persistence.BookRepository;

@SpringBootApplication
public class SimplebookserviceApplication implements CommandLineRunner {

private static final Logger logger = LoggerFactory.getLogger(SimplebookserviceApplication.class);
	
	@Autowired
    private Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(SimplebookserviceApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
        logger.info("\n----Begin logging BooksServiceApplication----");

        logger.info("----System Properties from VM Arguments----");
        logger.info("server.port: " + System.getProperty("server.port"));
        logger.info("----Program Arguments----");
        for (String arg : args) {
            logger.info(arg);
        }

        if (environment != null) {
            getActiveProfiles();
            logger.info("----Environment Properties----");
            logger.info("server.port: " + environment.getProperty("server.port"));
            logger.info("simpleweb.environment: " + environment.getProperty("simpleweb.environment"));
            logger.info("spring.datasource.url: " + environment.getProperty("spring.datasource.url"));
            logger.info("spring.datasource.username: " + environment.getProperty("spring.datasource.username"));
            logger.info("spring.datasource.password: " + environment.getProperty("spring.datasource.password"));
            logger.info("spring.jpa.database-platform: " + environment.getProperty("spring.jpa.database-platform"));
            logger.info("spring.jpa.hibernate.ddl-auto: " + environment.getProperty("spring.jpa.hibernate.ddl-auto"));
        }

        logger.info("----End logging BooksServiceApplication----");
    }

    private void getActiveProfiles() {
        for (final String profileName : environment.getActiveProfiles()) {
            logger.info("Currently active profile - " + profileName);
        }
    }
	
	
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Book("Blink", new Double(6)));
			repository.save(new Book("Mice and Men", new Double(20)));
			repository.save(new Book("Handmaid's Tales", new Double(15)));
			repository.save(new Book("The Painting", new Double(10)));
			repository.save(new Book("Matilda", new Double(11)));

			// fetch all books
			logger.info("Book found with findAll():");
			logger.info("-------------------------------");
			for (Book book : repository.findAll()) {
				logger.info(book.toString());
			}
			logger.info("");

			// fetch an individual book by ID
			repository.findById(1L)
				.ifPresent(customer -> {
					logger.info("Customer found with findById(1L):");
					logger.info("--------------------------------");
					logger.info(customer.toString());
					logger.info("");
				});

			
		};
	}

}
