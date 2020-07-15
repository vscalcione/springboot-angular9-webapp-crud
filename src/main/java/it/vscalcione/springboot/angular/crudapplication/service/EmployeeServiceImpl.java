package it.vscalcione.springboot.angular.crudapplication.service;

import it.vscalcione.springboot.angular.crudapplication.model.Employee;
import it.vscalcione.springboot.angular.crudapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long employeeId) {
        return this.employeeRepository.findById(employeeId);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employeeDetails) {
        return this.employeeRepository.save(employeeDetails);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        this.employeeRepository.delete(employee);
    }
}
