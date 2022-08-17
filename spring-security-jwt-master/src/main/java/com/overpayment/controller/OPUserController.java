package com.overpayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.overpayment.entity.Users;
import com.overpayment.repository.OPUserRepository;

@RestController
public class OPUserController {
	
	@Autowired
	private OPUserRepository userRepository;
	
	@GetMapping("/users")
	public List<Users> getUsers(){
		return userRepository.findAll();
	}

	@PostMapping("/adduser")
	public List<Users> addUsers(@RequestBody Users user){
		userRepository.save(user);
		return userRepository.findAll();
	}

	@PostMapping("/updateuser")
	public void updateUsers(@RequestBody Users user){
		System.out.println(user);
		user.setPassword("test");
		userRepository.save(user);
	}
	

	@GetMapping("/usersByLimit")
	public Page<Users> getUsers(@RequestParam(name = "pageIndex") Integer pageIndex, 
			@RequestParam(name = "pageSize") Integer pageSize){
		Pageable paging = PageRequest.of(pageIndex, pageSize);
		return userRepository.findAll(paging);
	}
	
	@GetMapping("/usersByEmail")
	public Users getUserByEmail(@RequestParam(name = "email") String email){
		return userRepository.findByEmail(email);
	}
	
	@GetMapping("/userSearch")
	public Page<Users> getUserSearch(@RequestParam(name = "pageIndex") Integer pageIndex, 
			@RequestParam(name = "pageSize") Integer pageSize,
			@RequestParam(name = "email", required = false) String email,
			@RequestParam(name = "name", required = false) String name
			){
		Pageable paging = PageRequest.of(pageIndex, pageSize);
		if(email == null && name == null) {
			return userRepository.findAll(paging);
		}
		return userRepository.findByEmailAndName(email,name,paging);
	}
	
}
