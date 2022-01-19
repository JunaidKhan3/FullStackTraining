package com.employeeApp.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeeApp.rest.EmployeeEntity.Employee;
import com.employeeApp.rest.Repo.EmployeeRepo;
import com.employeeApp.rest.services.EmployeeService;
import com.employeeApp.rest.services.EmployeeServiceImpl;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

	
//	private static final String[] value = null;
	@Autowired
	private EmployeeService empService;
	

//	@RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT);
//    public void updateEmployee(@RequestBody Employee employee , @PathVariable int Id ) {
//  //  	List<Employee> lstEmp1= empService.updateEmpList();
//    	empService.updateEmployee(Id, employee);
//    }
    
	@GetMapping("getEmp")
	public Employee getEmployee() {

		Employee emp = new Employee(1, "abc",29,100,"8968654768");
//		emp.setEmpId(1);
//		emp.setEmpName("md junaid");
//		emp.setAge(20);
//		emp.setSalary(20000);
		return emp;
	}
	  
//	@GetMapping("getEmpList")
//	public List<Employee> getEmployeeList() {
//		List<Employee> lstEmp = new ArrayList<>();
//		//write business here
//		// send 2 obj of emp in list
//		Employee emp1 = new Employee(1, "abc",29,100,"7895454545");
//		Employee emp2 = new Employee(2, "ahfd",29,100,"8654544487");
//		lstEmp.add(emp1);
//		lstEmp.add(emp2);
//		return lstEmp;	
//	}
	@PostMapping("postEmpList")
	public String setEmployeeList(@RequestBody Employee emp ) {
		//print emp
		System.out.println(emp.toString());	
		return "reveived object";
				
}
	@GetMapping("getAllEmpList")
	private List<Employee> getEmployeeAllList(){
		List<Employee> EmpAll=new ArrayList<>();
		Employee AllEmp1=new Employee(102,"asif raza",30,64837 ,"7008544588");
		Employee AllEmp2=new Employee(104,"Sahil",58,75847,"9878754447");
		EmpAll.add(AllEmp1);
		EmpAll.add(AllEmp2);
		return EmpAll;
		
	}
	
	@GetMapping("getList")
	private List<Employee> getList(){
		
		//return empRepo.findAll();
		return null;
	}
	@PostMapping("postAllEmpList")
	public String setAllEmpList(@RequestBody Employee AllEmp) {
		System.out.println(AllEmp.toString());
		return "Successfully post";
		
	}
	
	@PostMapping("saveEmp")//data inserted
	public String saveEmp(@RequestBody Employee emp) {
		System.out.println(emp.toString());
		empService.saveEmp(emp);
		return "Employee added successfully";
		
	}
	@GetMapping("getEmpListData")//showing Data
	public List<Employee> getEmployeeRealList() {
		List<Employee> lstEmp=empService.getEmployeeList();
		return lstEmp;	
	}
	@GetMapping("getEmpById/{id}")
	public Employee findEmployeeById(@PathVariable("id") int empId) {
		return empService.findEmployeeById(empId);
	}
	
	@GetMapping("getEmpByName/{Name}")
	public Employee findEmployeeByName(@PathVariable("Name") String empName ) {
		return empService.findEmployeeByName(empName);
	}
	
	@PostMapping("updateEmp")
	public String Merge(@RequestBody Employee emp) {
		System.out.println(emp.toString());
		empService.saveEmp(emp);
		return "Employee updated successfully";
	}
	@RequestMapping(value="delEmpById/{id}" , method=RequestMethod.GET)
	public String deleteEmployee(@PathVariable("id") int empId) {
		empService.deleteEmployeeById(empId);
		return "Data Deleted Successfully";
		
	}
	
	
}



	
