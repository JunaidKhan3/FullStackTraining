package com.Application.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Application.rest.EmployeeEntity.Instructor;
import com.Application.rest.services.InstructorApiService;

@RestController
@RequestMapping("/instructors")
public class InstructorApiController {

	
	@Autowired
	private InstructorApiService instapiservice;
	
	@PostMapping("save")//data inserted
	public String saveinstapi(@RequestBody Instructor instructor) {
		System.out.println(instructor.toString());
		instapiservice.saveinstapi(instructor);
		return "data added successfully";
	}
	@ResponseBody
	@GetMapping("/{id}")
	public Instructor getInstructor(@PathVariable int id) {
		return instapiservice.findById(id);
	}
	@GetMapping("getinstructorList")
	public List <Instructor> getInstructorList(){
		List<Instructor> ins=instapiservice.getinstructorList();
		return ins;
		
	}
		
}
