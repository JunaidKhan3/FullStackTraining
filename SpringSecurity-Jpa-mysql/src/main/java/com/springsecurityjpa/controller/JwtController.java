//package com.springsecurityjpa.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.springsecurityjpa.MyUserDetailsService;
//import com.springsecurityjpa.JwtUtilHelper.JwtUtil;
//import com.springsecurityjpa.Models.JwtRequest;
//import com.springsecurityjpa.Models.JwtResponse;
//
//@RestController
////@RequestMapping("jwt")
//public class JwtController {
//
//	@Autowired
//	private AuthenticationManager authenticationManager;
//	
//	@Autowired
//	private MyUserDetailsService myUserDetailsService;
//	
//	@Autowired
//	private JwtUtil jwtUtil;
//	
//	@PostMapping("/token")
//	public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{
////	public ResponseEntity<?>generatetoken(@RequestBody JwtRequest jwtRequest) throws Exception{
////		System.out.println(jwtRequest.toString());
//		
//		//Now authenticate username and password
//		try{
//			this.authenticationManager.authenticate(
//					new UsernamePasswordAuthenticationToken(
//					jwtRequest.getUsername(),
//					jwtRequest.getPassword()));
//			
//		}catch(UsernameNotFoundException e) {
//			e.printStackTrace();
//			throw new Exception("INVALID_USERNAME",e);
//		}
////		}catch(BadCredentialsException e) {
////			e.printStackTrace();
////			throw new Exception("Bad Credential");
////		}
////		
//		//fine area
//		//use final keyword 
//	final UserDetails userDetails=myUserDetailsService.loadUserByUsername (jwtRequest.getUsername());
//	final String token=jwtUtil.generateToken(userDetails);
//		//you can print also
//		System.out.println("JWT_TOKEN"+token);
//		
//		//{send an object where key is(token):(value) }
////		return ResponseEntity.ok(new JwtResponse(token));
//		return new JwtResponse(token);
//	}
//}
