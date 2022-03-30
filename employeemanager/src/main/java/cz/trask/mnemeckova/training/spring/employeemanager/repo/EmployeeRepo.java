package cz.trask.mnemeckova.training.spring.employeemanager.repo;

import cz.trask.mnemeckova.training.spring.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Transactional          // added to solve problems with the following method
    void deleteEmployeeById(Long id);              // Query Method
    Optional<Employee> findEmployeeById(Long id); // Query Method

}
