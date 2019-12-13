package com.springbootapirestful.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapirestful.dao.EmployeeDAO;
import com.springbootapirestful.model.Employee;

@RestController
@RequestMapping("/company")
public class EmployeeController {
	
	@Autowired
	EmployeeDAO empDao;
	
	//save to db
	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
		return empDao.save(emp);
	}
	
	//retrieve data from db - all
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return empDao.findAll();
	}
	
	//retrieve data by id
	
	@GetMapping("/emoloyees/{id}")
	public ResponseEntity<Employee> getEmployeebyId(@PathVariable(value="id") Long empid ){
		
		Employee emp = empDao.findById(empid);
		if(empid == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
	}
	
	//update data by empid
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long empid, @Valid @RequestBody Employee empdetails){
		
		Employee emp = (Employee) empDao.findById(empid);
		if(emp == null) {
			return ResponseEntity.notFound().build();
		}
		emp.setEmpId(empdetails.getEmpId());
		emp.setEmpName(empdetails.getEmpName());
		emp.setDesignation(empdetails.getDesignation());
		emp.setSkillSet(empdetails.getSkillSet());
		emp.setCreatedAt(empdetails.getCreatedAt());
		
		Employee updateEmployee = empDao.save(emp);
		return ResponseEntity.ok().body(updateEmployee);
	}
	
	//delete from db
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(value = "id") Long empid){
		
		Employee emp = empDao.findById(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		empDao.delete(emp);
		return ResponseEntity.ok().build();
	}
}
