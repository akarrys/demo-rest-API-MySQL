package com.akrestapiportfolio.demo.repository;

import com.akrestapiportfolio.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
