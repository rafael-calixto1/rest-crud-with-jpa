package com.dsenvolvendosistemas.demo.dao;

import com.dsenvolvendosistemas.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
