package com.example.global_exception_handling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.global_exception_handling.entity.Employee;
import com.example.global_exception_handling.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee addEmployee(Employee employee) {
		Employee saveEmployee=employeeRepository.save(employee);
		return saveEmployee;
	}
public List<Employee>getAllEmployees(){
	return employeeRepository.findAll();
}
public Employee getEmpById(Long id) {
	return employeeRepository.findById(id).get();
}
public void deleteById(Long id) {
	 employeeRepository.deleteById(id);
}
}
