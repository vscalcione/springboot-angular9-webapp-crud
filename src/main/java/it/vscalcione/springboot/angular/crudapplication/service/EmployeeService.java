package it.vscalcione.springboot.angular.crudapplication.service;

import it.vscalcione.springboot.angular.crudapplication.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(Long employeeId);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employeeDetails);
    void deleteEmployee(Employee employee);
}
