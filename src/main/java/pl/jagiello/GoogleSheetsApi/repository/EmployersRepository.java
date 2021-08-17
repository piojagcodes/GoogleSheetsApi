package pl.jagiello.GoogleSheetsApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.jagiello.GoogleSheetsApi.domain.Employers;

public interface EmployersRepository extends JpaRepository<Employers, Long> {

}
