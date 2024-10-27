package com.example.global_exception_handling.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
@Enumerated(EnumType.STRING)
private EmployeeStatus status;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(Long id, String name, EmployeeStatus status) {
	super();
	this.id = id;
	this.name = name;
	this.status = status;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public EmployeeStatus getStatus() {
	return status;
}

public void setStatus(EmployeeStatus status) {
	this.status = status;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", status=" + status + "]";
}

}
