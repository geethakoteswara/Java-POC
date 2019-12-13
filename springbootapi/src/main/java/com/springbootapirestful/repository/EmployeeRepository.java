package com.springbootapirestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapirestful.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
