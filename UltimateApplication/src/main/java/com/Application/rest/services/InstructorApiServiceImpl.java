package com.Application.rest.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Application.rest.EmployeeEntity.Instructor;
import com.Application.rest.Repo.InstructorApiRepo;

@Service
@Transactional
public class InstructorApiServiceImpl implements InstructorApiService {

	@Autowired
	private InstructorApiRepo instapirepo;

	@Override
	public void saveinstapi(Instructor instructor) {
		instapirepo.save(instructor);
	}

	@Override
	public List<Instructor> getinstructorList() {
		// TODO Auto-generated method stub
		return instapirepo.findAll();
	}

	@Override
	public Instructor findById(int id) {
		// TODO Auto-generated method stub
		return instapirepo.findById(id);
	}

	
	
}
