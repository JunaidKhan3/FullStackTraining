package com.springsecurityjpa.Models;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor; 
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class JwtResponse {

	private String token;

	public JwtResponse() {
		
	}

	public JwtResponse(String token) {
		
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
