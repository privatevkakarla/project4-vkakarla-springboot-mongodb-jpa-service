package com.springboot.microservices.demo.service;

import java.util.List;

import com.springboot.microservices.demo.entities.Employee;

public interface IEmployeeService {

	  public List<Employee> getAllEmployees();
	  public void saveEmployees(Employee employee);
	  public void updateEmployee(Employee employee);
	  public void deleteEmployees(String employeeId);
	
}
