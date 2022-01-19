package com.Application.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Application.rest.EmployeeEntity.Employee;
import com.Application.rest.Repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	

	@Override
	public List<Employee> getEmployeeList() {
		return empRepo.findAll();
	}
	
	@Override
	public Employee findEmployeeById(int employeeId) {
		return empRepo.findByEmpId(employeeId);
	}
	@Override
	public Employee findEmployeeByName(String employeeName) {
		return empRepo.findByEmpName(employeeName);
		
	}
	@Override
	public void saveEmp(Employee emp) {
		// TODO Auto-generated method stub
		empRepo.save(emp);
	}

	@Override
	public void merge(Employee emp) {//update   
		// TODO Auto-generated method stub
		empRepo.save(emp);
	}


	@Override
	public void deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Employee emp = empRepo.getById(empId);
		empRepo.delete(emp);
	}


}
