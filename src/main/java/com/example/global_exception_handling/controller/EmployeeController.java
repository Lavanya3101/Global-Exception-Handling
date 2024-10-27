package com.example.global_exception_handling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.global_exception_handling.entity.Employee;
import com.example.global_exception_handling.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee empSaved=employeeService.addEmployee(employee);
		return new ResponseEntity<Employee>(empSaved,HttpStatus.CREATED);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee>listOfAllemps=employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(listOfAllemps,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee>getById(@PathVariable Long id){
		Employee empById=employeeService.getEmpById(id);
		return new ResponseEntity<Employee>(empById,HttpStatus.OK);
		
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id){
		employeeService.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

}
