package com.springsecurityjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurityjpa.UserService;
import com.springsecurityjpa.Models.User;

@RestController
//@RequestMapping("")
public class Controller {
	
	@Autowired
	UserService userService;
	
	//for jwt 
	
	 @GetMapping("/welcome")
	    public String home() {
	        return "Welcome to Jwt Security Service";
	    }
	@PostMapping("/register")
	public User saveData(@RequestBody User user) {
		System.out.println(user.toString());
	return userService.saveData(user);
	}
	@GetMapping("/")
	public String Home() {
		return ("<h2>Welcome</h2>");	
	}
	@GetMapping("/user")
	public String USER() {
		return ("<h2>Welcome User</h2>");	
	}
	@GetMapping("/admin")
	public String ADMIN() {
		return ("<h2>Welcome Admin</h2>");	
	}
	 
}
