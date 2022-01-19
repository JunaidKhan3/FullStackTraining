package com.springsecurityjpa.Models;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class JwtRequest {

	
	private String Username;
	private String password;
	
	public JwtRequest() {
		
	}

	public JwtRequest(String username, String password) {
		this.Username = username;
		this.password = password;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JwtRequest [Username=" + Username + ", password=" + password + "]";
	}
	
	
}
