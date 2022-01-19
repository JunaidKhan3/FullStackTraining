package com.employeeApp.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeApp.rest.EmployeeEntity.Instructor;

import com.employeeApp.rest.services.InstructorApiService;

@RestController
@RequestMapping("/instructors")
public class InstructorApi {

	
	@Autowired
	private InstructorApiService instapiservice;
	
	@PostMapping("save")//data inserted
	public String saveinstapi(@RequestBody Instructor instructor) {
		System.out.println(instructor.toString());
		instapiservice.saveinstapi(instructor);
		return "data added successfully";
	}
	
	
}
