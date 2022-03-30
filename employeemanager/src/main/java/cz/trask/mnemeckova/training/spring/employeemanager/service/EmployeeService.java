package cz.trask.mnemeckova.training.spring.employeemanager.service;

import cz.trask.mnemeckova.training.spring.employeemanager.exception.UserNotFoundException;
import cz.trask.mnemeckova.training.spring.employeemanager.model.Employee;
import cz.trask.mnemeckova.training.spring.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

/*  private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }*/

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);      // save() is a method from Spring interface JpaRepository (which is implemented by EmployeeRepo)
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();          // findAll() is a method from Spring interface JpaRepository (which is implemented by EmployeeRepo)
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);     // save(employee) is a method from Spring interface JpaRepository (which is implemented by EmployeeRepo)
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("User with ID " + id + " was not found. "));
                                                                    // orElseThrow(Supplier<? extends X> exceptionSupplier) ... Supplier is functional interface
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }

}
