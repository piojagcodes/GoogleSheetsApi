package pl.jagiello.GoogleSheetsApi.database;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.jagiello.GoogleSheetsApi.domain.Employers;
import pl.jagiello.GoogleSheetsApi.repository.EmployersRepository;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployersRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employers(3L,"Frodo", "Baggins", "Male")));
            log.info("Preloading " + repository.save(new Employers(2L,"Gandalf", "The GrayHat", "Male")));
        };
    }

}
