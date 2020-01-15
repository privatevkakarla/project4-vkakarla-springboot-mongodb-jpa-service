package com.springboot.microservices.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.microservices.demo.entities.Employee;
import com.springboot.microservices.demo.repository.EmployeeRepository;
import com.springboot.microservices.demo.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> empList = null;
		empList = employeeRepository.findAll();
		return empList;
	}

	@Override
	public void saveEmployees(Employee employee) {

		employeeRepository.save(employee);

	}

	@Override
	public void updateEmployee(Employee employee) {

		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployees(String employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
