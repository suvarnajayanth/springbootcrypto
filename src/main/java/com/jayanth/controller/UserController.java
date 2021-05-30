package com.jayanth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jayanth.model.User;
import com.jayanth.repository.UserRepository;

import java.util.Optional;

/**
 * @author jayanth suvarna
 * Date :: 20/may/2021
 *
 */

@RestController
@RequestMapping("api/v1")
public class UserController {

	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		
		System.out.println(" ** ----------Entering to API Create USER  Method** --------------  ");
		return userRepository.save(user);
	}

	@GetMapping("/user/{id}")
	Optional<User> one(@PathVariable Long id) {

		return userRepository.findById(id);

	}
}
