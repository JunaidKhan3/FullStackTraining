package com.springsecurityjpa;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurityjpa.Models.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService{

//	@Override
//	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//	if(userName.equals("Junaid")) {
//		return new User("Junaid","Junaid@2",new ArrayList<>());
//	}else {
//		throw new UsernameNotFoundException("username not found");
//	}
//}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		return new MyUserDetails(username);
//		}
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	Optional<com.springsecurityjpa.Models.User>user =userRepository.findByUserName(userName);
	
	user.orElseThrow(()->new UsernameNotFoundException("Not found"+userName));
	return user.map(MyUserDetails::new).get();
	}

	}



