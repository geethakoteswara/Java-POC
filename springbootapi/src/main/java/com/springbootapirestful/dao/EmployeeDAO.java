package com.springbootapirestful.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapirestful.model.Employee;
import com.springbootapirestful.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository empRepository;
	
	//saving employee details
	public Employee save(Employee emp) {
		return empRepository.save(emp);
	}
	
	//searching/retrieving employee details
	public List<Employee> findAll(){
		return empRepository.findAll();
	}
	
	//updating data to db
	public Employee update(Employee emp) {
		return empRepository.save(emp);
	}
	
	public Employee findById(Long empid) {
		return empRepository.getOne(empid);
	}
	
	//deleting the data from db
	public void delete(Employee emp) {
		 empRepository.delete(emp);
	}
}
