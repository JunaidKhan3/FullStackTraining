package com.employeeApp.rest.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeeApp.rest.EmployeeEntity.Instructor;
import com.employeeApp.rest.Repo.InstructorApiRepo;

@Service
@Transactional
public class InstructorApiServiceImpl implements InstructorApiService {

	@Autowired
	private InstructorApiRepo instapirepo;

	@Override
	public void saveinstapi(Instructor instructor) {
		instapirepo.save(instructor);
	}

}
