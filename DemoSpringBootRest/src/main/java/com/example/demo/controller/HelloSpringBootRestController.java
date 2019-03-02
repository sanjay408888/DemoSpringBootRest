package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class HelloSpringBootRestController {
	
	@GetMapping(value="/hello")
	public ResponseEntity<Employee> sayHello(Employee emp)
	{   
		
	
		emp.setId("1");
		emp.setName("sk");
		
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}

}
