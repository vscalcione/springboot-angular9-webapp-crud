package it.vscalcione.springboot.angular.crudapplication.repository;

import it.vscalcione.springboot.angular.crudapplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
