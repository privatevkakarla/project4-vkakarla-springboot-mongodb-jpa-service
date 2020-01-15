package com.springboot.microservices.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.microservices.demo.entities.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
      
	
}
