package com.employeeApp.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employeeApp.rest.EmployeeEntity.Employee;
import com.employeeApp.rest.Repo.EmployeeRepo;

public interface EmployeeService {

	void saveEmp(Employee emp);
	void merge(Employee emp);

	List<Employee> getEmployeeList();

	public Employee findEmployeeById(int employeeId);

	public Employee findEmployeeByName(String employeeName); 

	public void deleteEmployeeById(int empId);

	
	
			
		
	}





	
//	public  Employee findEmployeeById(Long EmployeeId) {
//		
//		return EmployeeRepo.findByEmployeeId(EmployeeId);
//		
//	}
	
	
	
