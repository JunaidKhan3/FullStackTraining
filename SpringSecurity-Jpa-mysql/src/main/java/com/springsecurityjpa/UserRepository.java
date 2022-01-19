package com.springsecurityjpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurityjpa.Models.User;

public interface UserRepository extends JpaRepository<User, String>{
	Optional<User> findByUserName(String userName);

}
